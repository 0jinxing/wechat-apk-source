package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.cd.e;
import com.tencent.mm.g.a.kn;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.protocal.protobuf.axv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public final class ExtControlProviderNearBy extends ExtContentProviderBase
  implements d.a
{
  private static final String[] COLUMNS;
  private static boolean eBB;
  private static ap lQA;
  private static final UriMatcher lQy;
  private boolean bCS;
  private b.a ecy;
  private com.tencent.mm.pluginsdk.c.b eiw;
  private com.tencent.mm.modelgeo.d fwu;
  private int lQr;
  private List<axv> lQs;
  private e lQt;
  private Set<String> lQu;
  private CountDownLatch lQv;
  private CountDownLatch lQw;
  private axv lQx;
  private boolean lQz;

  static
  {
    AppMethodBeat.i(20376);
    COLUMNS = new String[] { "nickname", "avatar", "distance", "signature", "sex" };
    UriMatcher localUriMatcher = new UriMatcher(-1);
    lQy = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.NearBy", "male", 1);
    lQy.addURI("com.tencent.mm.plugin.ext.NearBy", "female", 2);
    lQy.addURI("com.tencent.mm.plugin.ext.NearBy", "all", 0);
    eBB = false;
    lQA = new ap(new ExtControlProviderNearBy.1(), false);
    AppMethodBeat.o(20376);
  }

  public ExtControlProviderNearBy()
  {
    AppMethodBeat.i(20366);
    this.lQz = false;
    this.eiw = new ExtControlProviderNearBy.3(this);
    this.ecy = new ExtControlProviderNearBy.4(this);
    AppMethodBeat.o(20366);
  }

  private axv Lg(String paramString)
  {
    AppMethodBeat.i(20369);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("MicroMsg.ExtControlProviderNearBy", "username is null or nill");
      AppMethodBeat.o(20369);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = this.lQs.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          axv localaxv = (axv)localIterator.next();
          if (localaxv.jBB.equals(paramString))
          {
            AppMethodBeat.o(20369);
            paramString = localaxv;
            break;
          }
        }
      AppMethodBeat.o(20369);
      paramString = null;
    }
  }

  private void a(axv paramaxv)
  {
    AppMethodBeat.i(20370);
    if ((paramaxv == null) || (paramaxv.jBB == null))
    {
      ab.e("MicroMsg.ExtControlProviderNearBy", "lbsContactInfo is null or lbsContactInfo's userName is null");
      AppMethodBeat.o(20370);
    }
    while (true)
    {
      return;
      this.lQu.add(paramaxv.jBB);
      Bitmap localBitmap = com.tencent.mm.ah.b.a(paramaxv.jBB, false, -1);
      ab.i("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet now count: " + this.lQw.getCount());
      if (localBitmap != null)
      {
        ab.i("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet countDown now");
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrayOfByte = new byte[0];
        if (localBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream))
          arrayOfByte = localByteArrayOutputStream.toByteArray();
        this.lQu.remove(paramaxv.jBB);
        this.lQt.addRow(new Object[] { paramaxv.jCH, arrayOfByte, paramaxv.wBS, paramaxv.guQ, Integer.valueOf(paramaxv.guN) });
        ab.i("MicroMsg.ExtControlProviderNearBy", "bitmap recycle %s", new Object[] { localBitmap });
        localBitmap.recycle();
      }
      AppMethodBeat.o(20370);
    }
  }

  private void brP()
  {
    AppMethodBeat.i(20372);
    if (this.lQu.size() > 0)
    {
      Iterator localIterator = this.lQu.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ab.i("MicroMsg.ExtControlProviderNearBy", "add lbsfriend has no avatar: ".concat(String.valueOf(str)));
        this.lQx = Lg(str);
        if ((this.lQx != null) && (this.lQx.jBB != null))
          this.lQt.addRow(new Object[] { this.lQx.jCH, null, this.lQx.wBS, this.lQx.guQ, Integer.valueOf(this.lQx.guN) });
      }
      AppMethodBeat.o(20372);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ExtControlProviderNearBy", "all user has got avatar");
      AppMethodBeat.o(20372);
    }
  }

  private static void dJ(boolean paramBoolean)
  {
    AppMethodBeat.i(20367);
    if (paramBoolean)
    {
      eBB = true;
      lQA.ae(15000L, 15000L);
      AppMethodBeat.o(20367);
    }
    while (true)
    {
      return;
      lQA.ae(0L, 0L);
      AppMethodBeat.o(20367);
    }
  }

  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public final String getType(Uri paramUri)
  {
    AppMethodBeat.i(20373);
    this.lQr = -1;
    switch (lQy.match(paramUri))
    {
    default:
      this.lQr = -1;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(20373);
      return null;
      this.lQr = 1;
      continue;
      this.lQr = 3;
      continue;
      this.lQr = 4;
    }
  }

  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public final boolean onCreate()
  {
    return true;
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(20371);
    ab.i("MicroMsg.ExtControlProviderNearBy", "notifyChanged: ".concat(String.valueOf(paramString)));
    if (this.bCS)
    {
      ab.i("MicroMsg.ExtControlProviderNearBy", "has finished");
      AppMethodBeat.o(20371);
    }
    while (true)
    {
      return;
      a(Lg(paramString));
      this.lQw.countDown();
      AppMethodBeat.o(20371);
    }
  }

  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramArrayOfString1 = null;
    AppMethodBeat.i(20368);
    ab.i("MicroMsg.ExtControlProviderNearBy", "query() ".concat(String.valueOf(paramUri)));
    a(paramUri, getContext(), 15);
    if (paramUri == null)
    {
      vf(3);
      AppMethodBeat.o(20368);
      paramUri = paramArrayOfString1;
    }
    while (true)
    {
      return paramUri;
      if ((bo.isNullOrNil(this.lPW)) || (bo.isNullOrNil(brL())))
      {
        vf(3);
        AppMethodBeat.o(20368);
        paramUri = paramArrayOfString1;
        continue;
      }
      if (eBB)
      {
        ab.w("MicroMsg.ExtControlProviderNearBy", "isDoingRequest, return null");
        vf(5);
        AppMethodBeat.o(20368);
        paramUri = paramArrayOfString1;
        continue;
      }
      dJ(true);
      if (!aVl())
      {
        dJ(false);
        vf(1);
        paramUri = this.jDN;
        AppMethodBeat.o(20368);
        continue;
      }
      if (!dJ(getContext()))
      {
        ab.w("MicroMsg.ExtControlProviderNearBy", "invalid appid ! return null");
        dJ(false);
        vf(2);
        AppMethodBeat.o(20368);
        paramUri = paramArrayOfString1;
        continue;
      }
      ab.i("MicroMsg.ExtControlProviderNearBy", "find type = " + this.lQr);
      getType(paramUri);
      if (this.lQr < 0)
      {
        ab.e("MicroMsg.ExtControlProviderNearBy", "unkown uri, return null");
        dJ(false);
        vf(3);
        AppMethodBeat.o(20368);
        paramUri = paramArrayOfString1;
        continue;
      }
      try
      {
        paramUri = new java/util/ArrayList;
        paramUri.<init>();
        this.lQs = paramUri;
        paramUri = new com/tencent/mm/cd/e;
        paramUri.<init>(COLUMNS, (byte)0);
        this.lQt = paramUri;
        paramUri = new java/util/concurrent/CountDownLatch;
        paramUri.<init>(1);
        this.lQv = paramUri;
        this.lQw = null;
        paramUri = new java/util/HashSet;
        paramUri.<init>();
        this.lQu = paramUri;
        paramUri = new java/util/ArrayList;
        paramUri.<init>();
        this.lQs = paramUri;
        this.bCS = false;
        ab.v("MicroMsg.ExtControlProviderNearBy", "start()");
        if (!aw.RK())
          ab.i("MicroMsg.ExtControlProviderNearBy", "!MMCore.hasSetUin()");
        while (true)
        {
          ab.i("MicroMsg.ExtControlProviderNearBy", "wait for get lbs info");
          if (!this.lQv.await(15000L, TimeUnit.MILLISECONDS))
            ab.w("MicroMsg.ExtControlProviderNearBy", "countDownLatchWait time out");
          if (this.lQw == null)
            break label555;
          ab.i("MicroMsg.ExtControlProviderNearBy", "get lbs info success, wait for get lbs friend");
          if (!this.lQw.await(15000L, TimeUnit.MILLISECONDS))
            ab.w("MicroMsg.ExtControlProviderNearBy", "countDownLatchGet time out");
          dJ(false);
          o.acd().b(this);
          this.bCS = true;
          brP();
          if ((this.lQt == null) || (this.lQt.getCount() <= 0))
            break label566;
          vf(0);
          ab.i("MicroMsg.ExtControlProviderNearBy", "return now");
          paramUri = this.lQt;
          AppMethodBeat.o(20368);
          break;
          com.tencent.mm.pluginsdk.c.b.a(kn.class.getName(), this.eiw);
          paramUri = new com/tencent/mm/plugin/ext/provider/ExtControlProviderNearBy$2;
          paramUri.<init>(this);
          al.d(paramUri);
        }
      }
      catch (Exception paramUri)
      {
        while (true)
        {
          ab.w("MicroMsg.ExtControlProviderNearBy", paramUri.getMessage());
          ab.printErrStackTrace("MicroMsg.ExtControlProviderNearBy", paramUri, "", new Object[0]);
          vf(4);
          continue;
          label555: ab.i("MicroMsg.ExtControlProviderNearBy", "not init countDownGet. return null");
          continue;
          label566: vf(4);
        }
      }
    }
  }

  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy
 * JD-Core Version:    0.6.2
 */