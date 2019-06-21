package android.support.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class PostMessageService extends Service
{
  private f.a kL = new PostMessageService.1(this);

  public IBinder onBind(Intent paramIntent)
  {
    return this.kL;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.customtabs.PostMessageService
 * JD-Core Version:    0.6.2
 */