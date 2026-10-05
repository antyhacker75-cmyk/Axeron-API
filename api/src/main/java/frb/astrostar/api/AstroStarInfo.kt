package frb.astrostar.api

import android.os.Parcelable
import frb.astrostar.server.ServerInfo
import frb.astrostar.shared.AstroStarApiConstant
import kotlinx.parcelize.Parcelize

@Parcelize
data class AstroStarInfo(
    val serverInfo: ServerInfo = ServerInfo()
) : Parcelable {

    fun getVersionCode(): Long {
        return serverInfo.versionCode
    }

    fun isRunning(): Boolean {
        return AstroStar.pingBinder() && AstroStarApiConstant.server.VERSION_CODE <= getVersionCode()
    }

    fun isNeedUpdate(): Boolean {
        return AstroStarApiConstant.server.VERSION_CODE > getVersionCode() && AstroStar.pingBinder()
    }

    fun isNeedExtraStep(): Boolean {
        return isRunning() && !serverInfo.permission
    }

    fun isRoot(): Boolean {
        return serverInfo.uid == 0
    }

}