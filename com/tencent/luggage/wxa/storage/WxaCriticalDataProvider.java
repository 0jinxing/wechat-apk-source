package com.tencent.luggage.wxa.storage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.luggage.g.d;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.o;
import com.tencent.mm.plugin.appbrand.launching.ac;
import com.tencent.mm.protocal.protobuf.axr;
import com.tencent.mm.protocal.protobuf.cwx;
import com.tencent.mm.protocal.protobuf.cwy;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public abstract class WxaCriticalDataProvider extends ContentProvider
{
  private static final UriMatcher bSb;
  private static final SparseArray<String> bSc;
  private volatile e bSd;
  private final Map<Class<?>, Object> bSe = new HashMap();

  static
  {
    SparseArray localSparseArray = new SparseArray();
    bSc = localSparseArray;
    localSparseArray.put(1, "WxaAttributesTable");
    bSc.put(2, "LaunchWxaAppPBTable");
    bSc.put(3, "WxaAppPackageModelTable");
    bSb = new UriMatcher(-1);
    for (int i = 0; i < bSc.size(); i++)
      bSb.addURI(a.AUTHORITY, (String)bSc.valueAt(i), bSc.keyAt(i));
  }

  private <T> T E(Class<T> paramClass)
  {
    return this.bSe.get(paramClass);
  }

  private boolean yn()
  {
    if (this.bSd == null)
      this.bSd = yo();
    if (this.bSd != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final void b(Class<?> paramClass, Object paramObject)
  {
    this.bSe.put(paramClass, paramObject);
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    if (!yn());
    for (int i = -1; ; i = 0)
      return i;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    if (!yn());
    while (true)
    {
      return null;
      switch (bSb.match(paramUri))
      {
      default:
      case 1:
      case 2:
      }
    }
    label321: 
    while (true)
    {
      while (true)
      {
        Object localObject1;
        Object localObject2;
        cwy localcwy;
        try
        {
          localObject1 = paramContentValues.getAsString("CONTENT_KEY_APPID");
          paramContentValues = paramContentValues.getAsByteArray("CONTENT_KEY_SYNC_PROTO");
          localObject2 = (o)E(o.class);
          paramUri = new com/tencent/mm/protocal/protobuf/cwy;
          paramUri.<init>();
          localcwy = (cwy)paramUri.parseFrom(paramContentValues);
          if (!bo.isNullOrNil((String)localObject1))
            break label196;
          paramUri = null;
          if (!TextUtils.isEmpty(paramUri))
            break label229;
          Iterator localIterator = localcwy.vMT.iterator();
          if (!localIterator.hasNext())
            break label321;
          paramContentValues = (cwx)localIterator.next();
          if (!"UserName".equalsIgnoreCase(paramContentValues.vMU))
            continue;
          paramUri = paramContentValues.pXM;
          paramContentValues = paramUri;
          if (!TextUtils.isEmpty(paramUri))
            break label231;
          ab.e("MicroMsg.WxaAttrStorage", "updateAttrsWithProto appId=%s, username EMPTY", new Object[] { localObject1 });
        }
        catch (Exception paramUri)
        {
          d.e("Luggage.WxaCriticalDataProvider", "insert WxaAttributes, e = %s", new Object[] { paramUri });
        }
        break;
        label196: paramUri = ((o)localObject2).e((String)localObject1, new String[] { "username" });
        if (paramUri == null)
        {
          paramUri = null;
        }
        else
        {
          paramUri = paramUri.field_username;
          continue;
          label229: paramContentValues = paramUri;
          label231: ((o)localObject2).a(paramContentValues, localcwy.vMS, localcwy.vMT);
          break;
          try
          {
            paramUri = paramContentValues.getAsString("CONTENT_KEY_APPID");
            localObject2 = paramContentValues.getAsByteArray("CONTENT_KEY_SYNC_PROTO");
            paramContentValues = (ac)E(ac.class);
            localObject1 = new com/tencent/mm/protocal/protobuf/axr;
            ((axr)localObject1).<init>();
            paramContentValues.b(paramUri, (axr)((axr)localObject1).parseFrom((byte[])localObject2));
          }
          catch (Exception paramUri)
          {
            d.e("Luggage.WxaCriticalDataProvider", "insert LaunchWxaAppPB, e = %s", new Object[] { paramUri });
          }
        }
      }
      break;
    }
  }

  public boolean onCreate()
  {
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    Object localObject = null;
    if (!yn())
      paramUri = localObject;
    while (true)
    {
      return paramUri;
      String str = (String)bSc.get(bSb.match(paramUri));
      paramUri = localObject;
      if (!TextUtils.isEmpty(str))
        paramUri = this.bSd.query(str, paramArrayOfString1, paramString1, paramArrayOfString2, null, null, paramString2);
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    if (!yn());
    for (int i = -1; ; i = 0)
      return i;
  }

  protected abstract e yo();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.wxa.storage.WxaCriticalDataProvider
 * JD-Core Version:    0.6.2
 */