package android.arch.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;

public class AndroidViewModel extends ViewModel
{

  @SuppressLint({"StaticFieldLeak"})
  private Application cc;

  public AndroidViewModel(Application paramApplication)
  {
    this.cc = paramApplication;
  }

  public <T extends Application> T getApplication()
  {
    return this.cc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.AndroidViewModel
 * JD-Core Version:    0.6.2
 */