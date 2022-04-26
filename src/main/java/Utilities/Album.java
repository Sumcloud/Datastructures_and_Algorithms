package Utilities;

public class Album implements Comparable<Album> {
    private String artist;
    private String albumName;
    private int releaseYear;

    public Album(String artist, String albumName, int releaseYear) {
        this.artist = artist;
        this.albumName = albumName;
        this.releaseYear = releaseYear;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * The compareTo method for this class compares based on release year. Other fields such as album name don't get compared.
     *
     * @param a Other album that is compared against.
     * @return Possible values -1,0,1
     */
    @Override
    public int compareTo(Album a) {
        if (releaseYear == a.getReleaseYear())
            return 0;
        else if (releaseYear > a.getReleaseYear())
            return 1;
        else
            return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Album))
            return false;

        Album tmp = (Album) o;

        if (artist != tmp.getArtist() || albumName != tmp.getAlbumName() || releaseYear != tmp.getReleaseYear())
            return false;
        else
            return true;
    }

    @Override
    public String toString() {
        return "Artist: " + artist + " Album: " + albumName + " Released in: " + releaseYear;
    }
}
