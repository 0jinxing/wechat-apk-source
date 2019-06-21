package android.support.customtabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.e;
import java.util.ArrayList;

public final class b$a
{
  public Bundle kA = null;
  public ArrayList<Bundle> kB = null;
  public boolean kC = true;
  public ArrayList<Bundle> kz = null;
  public final Intent mIntent = new Intent("android.intent.action.VIEW");

  public b$a()
  {
    this((byte)0);
  }

  private b$a(byte paramByte)
  {
    Bundle localBundle = new Bundle();
    e.a(localBundle, "android.support.customtabs.extra.SESSION", null);
    this.mIntent.putExtras(localBundle);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.customtabs.b.a
 * JD-Core Version:    0.6.2
 */