package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.cd.e;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bq;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderSearchContact extends ExtContentProviderBase
{
  private static List<String> elZ;
  private static final String[] lQC;
  private Cursor lQG = null;

  static
  {
    int i = 0;
    AppMethodBeat.i(20388);
    lQC = new String[] { "userId", "nickname", "avatar", "content", "msgId", "msgType" };
    elZ = new ArrayList();
    String[] arrayOfString = t.fkY;
    int j = arrayOfString.length;
    while (i < j)
    {
      String str = arrayOfString[i];
      elZ.add(str);
      i++;
    }
    elZ.add("officialaccounts");
    elZ.add("helper_entry");
    AppMethodBeat.o(20388);
  }

  public static Cursor g(Cursor paramCursor)
  {
    AppMethodBeat.i(20387);
    e locale = new e(lQC, (byte)0);
    try
    {
      int i;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (paramCursor.moveToFirst())
      {
        i = 0;
        i++;
        localObject1 = new com/tencent/mm/storage/ad;
        ((ad)localObject1).<init>();
        ((ad)localObject1).d(paramCursor);
        if (!t.kH(((ap)localObject1).field_username))
        {
          localObject2 = o.acv().b(((ap)localObject1).field_username, true, 0);
          if (localObject2 == null)
            break label257;
          localObject3 = new java/io/ByteArrayOutputStream;
          ((ByteArrayOutputStream)localObject3).<init>();
          ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject3);
          aw.ZK();
          bi[] arrayOfbi = com.tencent.mm.model.c.XO().cC(((ap)localObject1).field_username, 1);
          if ((arrayOfbi == null) || (arrayOfbi.length != 1))
            break label286;
          localObject2 = com.tencent.mm.plugin.ext.a.a.ii((int)((com.tencent.mm.n.a)localObject1).ewQ);
          String str = ((ad)localObject1).Oj();
          if (localObject3 != null)
            break label270;
          localObject3 = null;
          label153: if (arrayOfbi[0].getType() != 1)
            break label280;
          localObject1 = arrayOfbi[0].field_content;
          label172: locale.addRow(new Object[] { localObject2, str, localObject3, localObject1, com.tencent.mm.plugin.ext.a.a.ii(arrayOfbi[0].field_msgId), Integer.valueOf(com.tencent.mm.plugin.ext.b.b.V(arrayOfbi[0])) });
        }
      }
      while (true)
      {
        if ((paramCursor.moveToNext()) && (i < 15))
          break label420;
        paramCursor.close();
        AppMethodBeat.o(20387);
        paramCursor = locale;
        return paramCursor;
        label257: ab.w("MicroMsg.ExtControlProviderSearchContact", "get useravatar is null");
        localObject3 = null;
        break;
        label270: localObject3 = ((ByteArrayOutputStream)localObject3).toByteArray();
        break label153;
        label280: localObject1 = "";
        break label172;
        label286: ab.w("MicroMsg.ExtControlProviderSearchContact", "get msginfo failed");
        localObject2 = com.tencent.mm.plugin.ext.a.a.ii((int)((com.tencent.mm.n.a)localObject1).ewQ);
        localObject1 = ((ad)localObject1).Oj();
        if (localObject3 != null)
          break label410;
        localObject3 = null;
        locale.addRow(new Object[] { localObject2, localObject1, localObject3, "", "0", Integer.valueOf(0) });
      }
    }
    catch (Exception localException)
    {
      label410: label420: 
      while (true)
      {
        ab.e("MicroMsg.ExtControlProviderSearchContact", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderSearchContact", localException, "", new Object[0]);
        if (paramCursor != null)
          paramCursor.close();
        locale.close();
        AppMethodBeat.o(20387);
        paramCursor = null;
        continue;
        byte[] arrayOfByte = localException.toByteArray();
      }
    }
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
    AppMethodBeat.i(20386);
    ab.d("MicroMsg.ExtControlProviderSearchContact", "query()");
    a(paramUri, getContext(), 16);
    if (paramUri == null)
    {
      vf(3);
      AppMethodBeat.o(20386);
      paramUri = paramArrayOfString1;
    }
    while (true)
    {
      return paramUri;
      if ((bo.isNullOrNil(this.lPW)) || (bo.isNullOrNil(brL())))
      {
        vf(3);
        AppMethodBeat.o(20386);
        paramUri = paramArrayOfString1;
      }
      else if (!aVl())
      {
        vf(1);
        paramUri = this.jDN;
        AppMethodBeat.o(20386);
      }
      else if (!dJ(getContext()))
      {
        ab.w("MicroMsg.ExtControlProviderSearchContact", "invalid appid ! return null");
        vf(2);
        AppMethodBeat.o(20386);
        paramUri = paramArrayOfString1;
      }
      else if ((paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
      {
        ab.e("MicroMsg.ExtControlProviderSearchContact", "invaild selections");
        vf(3);
        AppMethodBeat.o(20386);
        paramUri = paramArrayOfString1;
      }
      else
      {
        paramUri = paramArrayOfString2[0].trim();
        if (bo.isNullOrNil(paramUri))
        {
          ab.e("MicroMsg.ExtControlProviderSearchContact", "filter should not be null or nil");
          vf(3);
          AppMethodBeat.o(20386);
          paramUri = paramArrayOfString1;
        }
        else
        {
          paramUri = aw.ZK().fke.a(paramUri, "@micromsg.no.verify.biz.qq.com", elZ, false, 1, null);
          if (paramUri != null)
            break;
          ab.e("MicroMsg.ExtControlProviderSearchContact", "cursor is null");
          vf(3);
          AppMethodBeat.o(20386);
          paramUri = paramArrayOfString1;
        }
      }
    }
    paramArrayOfString1 = new com.tencent.mm.pluginsdk.d.a.b();
    paramArrayOfString1.b(4000L, new ExtControlProviderSearchContact.1(this, paramUri, paramArrayOfString1));
    if (this.lQG != null)
      vf(0);
    while (true)
    {
      paramUri = this.lQG;
      AppMethodBeat.o(20386);
      break;
      vf(4);
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact
 * JD-Core Version:    0.6.2
 */