package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fm;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderAccountSync extends ExtContentProviderBase
{
  private static final UriMatcher lQc;

  static
  {
    AppMethodBeat.i(20342);
    UriMatcher localUriMatcher = new UriMatcher(-1);
    lQc = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.AccountSync", "accountSync", 1);
    AppMethodBeat.o(20342);
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramArrayOfString1 = null;
    AppMethodBeat.i(20341);
    ab.d("MicroMsg.ExtControlAccountSyncProvider", "query()");
    a(paramUri, getContext(), lQc);
    if (paramUri == null)
    {
      vf(3);
      AppMethodBeat.o(20341);
      paramUri = paramArrayOfString1;
    }
    while (true)
    {
      return paramUri;
      if ((bo.isNullOrNil(this.lPW)) || (bo.isNullOrNil(brL())))
      {
        vf(3);
        AppMethodBeat.o(20341);
        paramUri = paramArrayOfString1;
      }
      else if (!aVl())
      {
        vf(1);
        paramUri = this.jDN;
        AppMethodBeat.o(20341);
      }
      else if (!dJ(getContext()))
      {
        ab.w("MicroMsg.ExtControlAccountSyncProvider", "invalid appid ! return null");
        vf(2);
        AppMethodBeat.o(20341);
        paramUri = paramArrayOfString1;
      }
      else
      {
        switch (lQc.match(paramUri))
        {
        default:
          vf(3);
          AppMethodBeat.o(20341);
          paramUri = paramArrayOfString1;
        case 1:
        }
      }
    }
    ab.i("MicroMsg.ExtControlAccountSyncProvider", "startContactSync()");
    paramUri = new fm();
    if (a.xxA.m(paramUri))
      vf(0);
    while (true)
    {
      AppMethodBeat.o(20341);
      paramUri = paramArrayOfString1;
      break;
      ab.e("MicroMsg.ExtControlAccountSyncProvider", "AccountHelper == null");
      vf(4);
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderAccountSync
 * JD-Core Version:    0.6.2
 */