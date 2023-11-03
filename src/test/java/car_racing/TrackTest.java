package car_racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrackTest {

    @Test
    @DisplayName("생성/자동차N대 이동횟수M회로 생성/생성된다.")
    void createTrack() {
        Track track = new Track(10, 5);
        assertThat(track).isInstanceOf(Track.class);
    }
}
