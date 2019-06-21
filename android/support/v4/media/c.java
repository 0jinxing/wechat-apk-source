package android.support.v4.media;

import android.os.Bundle;

public final class c
{
  public static boolean a(Bundle paramBundle1, Bundle paramBundle2)
  {
    boolean bool = true;
    if (paramBundle1 == paramBundle2);
    while (true)
    {
      return bool;
      if (paramBundle1 == null)
      {
        if ((paramBundle2.getInt("android.media.browse.extra.PAGE", -1) != -1) || (paramBundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1))
          bool = false;
      }
      else if (paramBundle2 == null)
      {
        if ((paramBundle1.getInt("android.media.browse.extra.PAGE", -1) != -1) || (paramBundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1))
          bool = false;
      }
      else if ((paramBundle1.getInt("android.media.browse.extra.PAGE", -1) != paramBundle2.getInt("android.media.browse.extra.PAGE", -1)) || (paramBundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1) != paramBundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)))
        bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.media.c
 * JD-Core Version:    0.6.2
 */