abstract class MediaContent {
    public String title;
    public int releaseYear;
    public int duration;

    public abstract void play();
    public abstract int getDuration();

}


class Movie extends MediaContent implements Downloadable {
    public String director;
    public String genre;

    public Movie(String title, int releaseYear, int duration, String director, String genre) {
        this.director = director;
        this.genre = genre;
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.title);
    }

    @Override
    public int getDuration() {
        return this.duration;
    }

    @Override
    public void download() {
        System.out.println("Downloaded " + this.title + "!");
    }
}

class TVSeries extends MediaContent implements Downloadable {
    public int seasons;
    public int episodesPerSeason;

    public TVSeries(String title, int releaseYear, int duration, int seasons, int episodesPerSeason) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
    }

    @Override
    public void download() {
        System.out.println("Downloading " + this.title);
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.title);
    }

    @Override
    public int getDuration() {
        return this.duration;
    }
}
