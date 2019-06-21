package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.e;
import com.tencent.mm.g.a.ff;
import com.tencent.mm.g.a.ff.b;
import com.tencent.mm.g.a.fg;
import com.tencent.mm.g.a.fg.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.List;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public final class ExtControlProviderSNS extends ExtContentProviderBase
{
  private static boolean eBB;
  private static com.tencent.mm.sdk.platformtools.ap lQA;
  private static final String[] lQC;
  private static final UriMatcher lQc;
  private boolean czq = false;
  private boolean czr = false;
  private int czs = 0;
  private String lQD = "";

  static
  {
    AppMethodBeat.i(20384);
    lQC = new String[] { "feedId", "desc", "url", "nickname", "avatar", "timestamp", "mediaCount", "type", "bigImgUrl", "firstImgWidth", "firstImgHeight" };
    UriMatcher localUriMatcher = new UriMatcher(-1);
    lQc = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.SNS", "snsInfo", 17);
    eBB = false;
    lQA = new com.tencent.mm.sdk.platformtools.ap(new ExtControlProviderSNS.1(), false);
    AppMethodBeat.o(20384);
  }

  private Cursor brQ()
  {
    AppMethodBeat.i(20383);
    ab.i("MicroMsg.ExtControlProviderSNS", "getSnsCursor() , needDownload = true");
    e locale = new e(lQC, (byte)0);
    Object localObject1 = new ff();
    ((ff)localObject1).cyG.cyI = this.lQD;
    if (!com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1))
    {
      locale.close();
      localObject1 = null;
      AppMethodBeat.o(20383);
      return localObject1;
    }
    Cursor localCursor = ((ff)localObject1).cyH.cyz;
    if (localCursor != null);
    while (true)
    {
      try
      {
        i = localCursor.getCount();
        ab.i("MicroMsg.ExtControlProviderSNS", "in getSnsCursor(), snsCount = ".concat(String.valueOf(i)));
        fg localfg;
        if ((i > 0) && (localCursor.moveToFirst()))
        {
          if (localCursor != null)
          {
            localfg = new com/tencent/mm/g/a/fg;
            localfg.<init>();
            localfg.cyJ.cyL = localCursor;
            if (!com.tencent.mm.sdk.b.a.xxA.m(localfg))
              ab.w("MicroMsg.ExtControlProviderSNS", "ExtGetSnsDataEvent publish error");
          }
          else
          {
            if (localCursor.moveToNext())
              continue;
          }
        }
        else
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("in getSnsCursor(), matrixCursor Count = ");
          ab.i("MicroMsg.ExtControlProviderSNS", locale.getCount());
          localCursor.close();
          AppMethodBeat.o(20383);
          localObject1 = locale;
          break;
        }
        aw.ZK();
        Object localObject2 = c.XM().aoM(localfg.cyK.cyM);
        if ((localObject2 == null) || ((int)((com.tencent.mm.n.a)localObject2).ewQ <= 0))
          continue;
        String str2 = "";
        switch (localfg.cyK.cyQ)
        {
        case 6:
        default:
          i = 5;
          if ((localfg.cyK.cyS == null) || (localfg.cyK.cyS.size() <= 0) || (getContext() == null))
            break label838;
          ab.d("MicroMsg.ExtControlProviderSNS", "uris.size() = [%s]", new Object[] { Integer.valueOf(localfg.cyK.cyS.size()) });
          if ((i != 2) && (i != 6) && (i != 3) && (i != 4))
            break label838;
          localObject1 = (String)localfg.cyK.cyS.get(0);
          String str3 = str2;
          if (localfg.cyK.cyT != null)
          {
            str3 = str2;
            if (localfg.cyK.cyT.size() > 0)
            {
              str3 = str2;
              if (getContext() != null)
              {
                ab.d("MicroMsg.ExtControlProviderSNS", "bigImgUris.size() = [%s], firstImgWidth = [%s], firstImgHeight = [%s]", new Object[] { Integer.valueOf(localfg.cyK.cyT.size()), Integer.valueOf(localfg.cyK.cyU), Integer.valueOf(localfg.cyK.cyV) });
                if ((i != 2) && (i != 6) && (i != 3))
                {
                  str3 = str2;
                  if (i != 4);
                }
                else
                {
                  str3 = (String)localfg.cyK.cyT.get(0);
                }
              }
            }
          }
          str2 = com.tencent.mm.ah.b.pX(localfg.cyK.cyM);
          try
          {
            String str4 = com.tencent.mm.plugin.ext.a.a.ii(localfg.cyK.cyN);
            String str5 = localfg.cyK.cyO;
            String str6 = ((ad)localObject2).Oj();
            localObject2 = str2;
            if (str2 == null)
              localObject2 = "";
            locale.addRow(new Object[] { str4, str5, localObject1, str6, localObject2, Long.valueOf(localfg.cyK.cyP), Integer.valueOf(localfg.cyK.cyR), Integer.valueOf(i), str3, Integer.valueOf(localfg.cyK.cyU), Integer.valueOf(localfg.cyK.cyV) });
          }
          catch (Exception localException1)
          {
            ab.e("MicroMsg.ExtControlProviderSNS", localException1.getMessage());
            ab.printErrStackTrace("MicroMsg.ExtControlProviderSNS", localException1, "", new Object[0]);
          }
          continue;
        case 2:
        case 1:
        case 7:
        case 8:
        case 4:
        case 3:
        case 5:
        }
      }
      catch (Exception localException2)
      {
        ab.e("MicroMsg.ExtControlProviderSNS", localException2.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderSNS", localException2, "", new Object[0]);
        if (localCursor != null)
          localCursor.close();
        locale.close();
        str1 = null;
        AppMethodBeat.o(20383);
      }
      break;
      int i = 1;
      continue;
      i = 2;
      continue;
      i = 3;
      continue;
      i = 6;
      continue;
      i = 4;
      continue;
      label838: String str1 = "";
    }
  }

  private static void dJ(boolean paramBoolean)
  {
    AppMethodBeat.i(20380);
    if (paramBoolean)
    {
      eBB = true;
      lQA.ae(15000L, 15000L);
      AppMethodBeat.o(20380);
    }
    while (true)
    {
      return;
      lQA.ae(0L, 0L);
      AppMethodBeat.o(20380);
    }
  }

  private Cursor ij(long paramLong)
  {
    int i = 1;
    AppMethodBeat.i(20382);
    ab.i("MicroMsg.ExtControlProviderSNS", "handleGetSnsInfo() userId = ".concat(String.valueOf(paramLong)));
    try
    {
      ab.i("MicroMsg.ExtControlProviderSNS", "startGetSNSInfo, userId=[%s]", new Object[] { Long.valueOf(paramLong) });
      ad localad;
      if (paramLong == 0L)
      {
        aw.ZK();
        localad = c.XM().aoM(r.Yz());
        if ((localad != null) && ((int)localad.ewQ > 0))
          break label131;
        ab.e("MicroMsg.ExtControlProviderSNS", "ct == null");
        i = 0;
      }
      while (true)
      {
        if (i != 0)
          break label258;
        ab.w("MicroMsg.ExtControlProviderSNS", "startGetSNSInfo() return false");
        localad = null;
        AppMethodBeat.o(20382);
        return localad;
        aw.ZK();
        localad = c.XM().mQ(paramLong);
        break;
        label131: this.czq = com.tencent.mm.n.a.jh(localad.field_type);
        this.czr = r.mG(localad.field_username);
        ab.d("MicroMsg.ExtControlProviderSNS", "ct.getUsername()=[%s], isFriend=[%s], isSelf=[%s]", new Object[] { localad.field_username, Boolean.valueOf(this.czq), Boolean.valueOf(this.czr) });
        com.tencent.mm.pluginsdk.d.a.b localb = new com/tencent/mm/pluginsdk/d/a/b;
        localb.<init>();
        ExtControlProviderSNS.2 local2 = new com/tencent/mm/plugin/ext/provider/ExtControlProviderSNS$2;
        local2.<init>(this, localad, localb);
        localb.b(10000L, local2);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ExtControlProviderSNS", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderSNS", localException, "", new Object[0]);
        label258: Cursor localCursor = brQ();
        AppMethodBeat.o(20382);
      }
    }
  }

  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public final String getType(Uri paramUri)
  {
    return null;
  }

  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public final boolean onCreate()
  {
    return false;
  }

  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    AppMethodBeat.i(20381);
    ab.i("MicroMsg.ExtControlProviderSNS", "query() ".concat(String.valueOf(paramUri)));
    a(paramUri, getContext(), lQc);
    if (paramUri == null)
    {
      vf(3);
      AppMethodBeat.o(20381);
      paramUri = null;
    }
    while (true)
    {
      label50: return paramUri;
      if ((bo.isNullOrNil(this.lPW)) || (bo.isNullOrNil(brL())))
      {
        vf(3);
        AppMethodBeat.o(20381);
        paramUri = null;
      }
      else if (eBB)
      {
        ab.w("MicroMsg.ExtControlProviderSNS", "isBusy, return null");
        vf(5);
        AppMethodBeat.o(20381);
        paramUri = null;
      }
      else
      {
        dJ(true);
        if (!aVl())
        {
          dJ(false);
          vf(1);
          paramUri = this.jDN;
          AppMethodBeat.o(20381);
        }
        else if (!dJ(getContext()))
        {
          ab.w("MicroMsg.ExtControlProviderSNS", "invalid appid ! return null");
          dJ(false);
          vf(2);
          AppMethodBeat.o(20381);
          paramUri = null;
        }
        else if ((paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
        {
          ab.e("MicroMsg.ExtControlProviderSNS", "invaild selections");
          dJ(false);
          vf(3);
          AppMethodBeat.o(20381);
          paramUri = null;
        }
        else
        {
          paramArrayOfString1 = paramArrayOfString2[0];
          if (!bo.isNullOrNil(paramArrayOfString1))
            break;
          ab.e("MicroMsg.ExtControlProviderSNS", "userIdStr should not be null or nil");
          dJ(false);
          vf(3);
          AppMethodBeat.o(20381);
          paramUri = null;
        }
      }
    }
    while (true)
    {
      long l;
      try
      {
        boolean bool = "0".equals(paramArrayOfString1.trim());
        if (bool)
          l = 0L;
        switch (lQc.match(paramUri))
        {
        default:
          paramUri = null;
          if (paramUri == null)
            break label404;
          vf(0);
          dJ(false);
          AppMethodBeat.o(20381);
          break label50;
          l = com.tencent.mm.plugin.ext.a.a.Le(paramArrayOfString1.trim());
          continue;
        case 17:
        }
      }
      catch (Exception paramUri)
      {
        ab.e("MicroMsg.ExtControlProviderSNS", paramUri.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderSNS", paramUri, "", new Object[0]);
        dJ(false);
        vf(4);
        AppMethodBeat.o(20381);
        paramUri = null;
      }
      break;
      paramUri = ij(l);
      continue;
      label404: vf(4);
    }
  }

  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS
 * JD-Core Version:    0.6.2
 */