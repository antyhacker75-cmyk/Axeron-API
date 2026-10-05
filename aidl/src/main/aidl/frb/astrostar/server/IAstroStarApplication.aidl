package frb.astrostar.server;

interface IAstroStarApplication {

    oneway void bindApplication(in Bundle data) = 1;
}