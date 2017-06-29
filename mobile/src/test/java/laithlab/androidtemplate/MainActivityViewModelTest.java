package laithlab.androidtemplate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MainActivityViewModelTest {

    private MainActivityViewModel sut;

//    Use @Mock to mock dependencies in the sut

    @Before
    public void setup() {
        sut = new MainActivityViewModel();
    }

    @Test
    public void itShouldReturnTwo() {
        assertEquals(sut.add(1), 2);
    }
}