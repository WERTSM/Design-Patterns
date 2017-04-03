package headfirst._13_proxy.javaproxy;

/**
 * Created by WERT on 03.04.2017.
 */
public interface PersonBean {

    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);

}