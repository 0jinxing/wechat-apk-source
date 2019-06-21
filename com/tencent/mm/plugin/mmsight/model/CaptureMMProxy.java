package com.tencent.mm.plugin.mmsight.model;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.remoteservice.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bs;
import com.tencent.mm.storage.z;
import java.io.Serializable;
import java.lang.reflect.Method;

public class CaptureMMProxy extends com.tencent.mm.remoteservice.a
{
  private static CaptureMMProxy otb;
  private static String otc = "";

  public CaptureMMProxy(com.tencent.mm.remoteservice.d paramd)
  {
    super(paramd);
  }

  public static void createProxy(CaptureMMProxy paramCaptureMMProxy)
  {
    otb = paramCaptureMMProxy;
  }

  public static CaptureMMProxy getInstance()
  {
    return otb;
  }

  public boolean checkUseMMVideoPlayer()
  {
    AppMethodBeat.i(76444);
    Object localObject = REMOTE_CALL("checkUseMMVideoPlayerInMM", new Object[0]);
    boolean bool;
    if (localObject != null)
    {
      ab.i("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayer[%b]", new Object[] { localObject });
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(76444);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(76444);
      bool = true;
    }
  }

  @f
  public boolean checkUseMMVideoPlayerInMM()
  {
    AppMethodBeat.i(76446);
    ab.d("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayerInMM() called");
    com.tencent.mm.modelcontrol.d.afF();
    boolean bool = com.tencent.mm.modelcontrol.d.afO();
    ab.d("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayerInMM() returned: ".concat(String.valueOf(bool)));
    AppMethodBeat.o(76446);
    return bool;
  }

  public Object get(ac.a parama, Object paramObject)
  {
    AppMethodBeat.i(76436);
    ab.i("MicroMsg.CaptureMMProxy", "get %s %s", new Object[] { parama, paramObject });
    Object localObject = REMOTE_CALL("getConfigStorage", new Object[] { parama, paramObject });
    ab.i("MicroMsg.CaptureMMProxy", "get %s %s and get val %s", new Object[] { parama, paramObject, localObject });
    if (localObject == null)
      AppMethodBeat.o(76436);
    for (parama = paramObject; ; parama = localObject)
    {
      return parama;
      AppMethodBeat.o(76436);
    }
  }

  public String getAccVideoPath()
  {
    AppMethodBeat.i(76434);
    String str = (String)REMOTE_CALL("getAccVideoPathInMM", new Object[0]);
    ab.i("MicroMsg.CaptureMMProxy", "getAccVideoPathInMM " + str + " accVideoPath: " + otc);
    if (!bo.isNullOrNil(str))
      otc = str;
    if (!bo.isNullOrNil(otc))
    {
      str = otc;
      AppMethodBeat.o(76434);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(76434);
    }
  }

  @f
  public String getAccVideoPathInMM()
  {
    AppMethodBeat.i(76447);
    ab.d("MicroMsg.CaptureMMProxy", "getAccVideoPathInMM");
    com.tencent.mm.modelvideo.o.alk();
    String str = com.tencent.mm.modelvideo.o.getAccVideoPath();
    AppMethodBeat.o(76447);
    return str;
  }

  public boolean getBoolean(ac.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(76438);
    ab.i("MicroMsg.CaptureMMProxy", "getBoolean %s %s", new Object[] { parama, Boolean.valueOf(paramBoolean) });
    Object localObject = REMOTE_CALL("getConfigStorage", new Object[] { parama, Boolean.valueOf(paramBoolean) });
    ab.i("MicroMsg.CaptureMMProxy", "getBoolean %s %s and get val %s", new Object[] { parama, Boolean.valueOf(paramBoolean), localObject });
    if (localObject == null)
      AppMethodBeat.o(76438);
    while (true)
    {
      return paramBoolean;
      paramBoolean = bo.getBoolean(localObject.toString(), paramBoolean);
      AppMethodBeat.o(76438);
    }
  }

  @f
  public Object getConfigStorage(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(76449);
    ac.a locala = ((ac.a[])ac.a.class.getEnumConstants())[paramInt];
    ab.i("MicroMsg.CaptureMMProxy", "getConfigStorage, %s %s", new Object[] { locala, paramObject });
    com.tencent.mm.kernel.g.RQ();
    paramObject = com.tencent.mm.kernel.g.RP().Ry().get(locala, paramObject);
    AppMethodBeat.o(76449);
    return paramObject;
  }

  public String getDeviceInfoConfig()
  {
    AppMethodBeat.i(76441);
    String str = (String)REMOTE_CALL("getDeviceInfoConfigInMM", new Object[0]);
    ab.i("MicroMsg.CaptureMMProxy", "getDeviceInfoConfig return: %s", new Object[] { str });
    AppMethodBeat.o(76441);
    return str;
  }

  @f
  public String getDeviceInfoConfigInMM()
  {
    AppMethodBeat.i(76451);
    com.tencent.mm.kernel.g.RQ();
    String str = com.tencent.mm.kernel.g.RP().Rz().dur();
    AppMethodBeat.o(76451);
    return str;
  }

  public String getDynamicConfig(String paramString)
  {
    AppMethodBeat.i(76442);
    String str = (String)REMOTE_CALL("getDynamicConfigInMM", new Object[] { paramString });
    ab.i("MicroMsg.CaptureMMProxy", "getDynamicConfig, key: %s, value: %s", new Object[] { paramString, str });
    AppMethodBeat.o(76442);
    return str;
  }

  @f
  public String getDynamicConfigInMM(String paramString)
  {
    AppMethodBeat.i(76452);
    paramString = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue(paramString);
    AppMethodBeat.o(76452);
    return paramString;
  }

  public int getInt(ac.a parama, int paramInt)
  {
    AppMethodBeat.i(76437);
    ab.i("MicroMsg.CaptureMMProxy", "getInt %s %s", new Object[] { parama, Integer.valueOf(paramInt) });
    Object localObject = REMOTE_CALL("getConfigStorage", new Object[] { parama, Integer.valueOf(paramInt) });
    ab.i("MicroMsg.CaptureMMProxy", "getInt %s %s and get val %s", new Object[] { parama, Integer.valueOf(paramInt), localObject });
    if (localObject == null)
      AppMethodBeat.o(76437);
    while (true)
    {
      return paramInt;
      paramInt = bo.getInt(localObject.toString(), paramInt);
      AppMethodBeat.o(76437);
    }
  }

  public VideoTransPara getSnsAlbumVideoTransPara()
  {
    AppMethodBeat.i(76440);
    Object localObject = (Parcelable)REMOTE_CALL("getSnsAlbumVideoTransParaInMM", new Object[0]);
    ab.d("MicroMsg.CaptureMMProxy", "getSnsAlbumVideoTransPara() returned: ".concat(String.valueOf(localObject)));
    localObject = (VideoTransPara)localObject;
    AppMethodBeat.o(76440);
    return localObject;
  }

  @f
  public VideoTransPara getSnsAlbumVideoTransParaInMM()
  {
    AppMethodBeat.i(76445);
    ab.d("MicroMsg.CaptureMMProxy", "getSnsAlbumVideoTransParaInMM() called");
    VideoTransPara localVideoTransPara = com.tencent.mm.modelcontrol.d.afF().afI();
    ab.d("MicroMsg.CaptureMMProxy", "getVideoTransParaInMM() returned: ".concat(String.valueOf(localVideoTransPara)));
    AppMethodBeat.o(76445);
    return localVideoTransPara;
  }

  public String getSubCoreImageFullPath(String paramString)
  {
    AppMethodBeat.i(76435);
    paramString = (String)REMOTE_CALL("getSubCoreImageFullPathInMM", new Object[] { paramString });
    ab.i("MicroMsg.CaptureMMProxy", "getSubCoreImageFullPath ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(76435);
    return paramString;
  }

  @f
  public String getSubCoreImageFullPathInMM(String paramString)
  {
    AppMethodBeat.i(76448);
    ab.d("MicroMsg.CaptureMMProxy", "getSubCoreImageFullPathInMM, %s", new Object[] { paramString });
    paramString = com.tencent.mm.at.o.ahl().getFullPath(paramString);
    AppMethodBeat.o(76448);
    return paramString;
  }

  public byte[] getWeixinMeta()
  {
    AppMethodBeat.i(76443);
    byte[] arrayOfByte = (byte[])REMOTE_CALL("getWeixinMetaDataInMM", new Object[0]);
    ab.i("MicroMsg.CaptureMMProxy", "getWeixinMeta result: %s", new Object[] { arrayOfByte });
    AppMethodBeat.o(76443);
    return arrayOfByte;
  }

  @f
  public byte[] getWeixinMetaDataInMM()
  {
    AppMethodBeat.i(76453);
    byte[] arrayOfByte = com.tencent.mm.modelcontrol.d.afF().getWeixinMeta();
    AppMethodBeat.o(76453);
    return arrayOfByte;
  }

  public final Bundle objectsToBundle(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(76454);
    Bundle localBundle = new Bundle();
    int i = paramArrayOfObject.length;
    int j = 0;
    if (j < i)
    {
      if ((paramArrayOfObject[j] instanceof Bundle))
        localBundle.putBundle(String.valueOf(j), (Bundle)paramArrayOfObject[j]);
      while (true)
      {
        j++;
        break;
        if ((paramArrayOfObject[j] instanceof Parcelable))
        {
          localBundle.putParcelable(String.valueOf(j), (Parcelable)paramArrayOfObject[j]);
        }
        else if ((paramArrayOfObject[j] instanceof ac.a))
        {
          ab.i("MicroMsg.CaptureMMProxy", "objectsToBundle: %s", new Object[] { Integer.valueOf(((ac.a)paramArrayOfObject[j]).ordinal()) });
          localBundle.putInt(String.valueOf(j), ((ac.a)paramArrayOfObject[j]).ordinal());
        }
        else
        {
          localBundle.putSerializable(String.valueOf(j), (Serializable)paramArrayOfObject[j]);
        }
      }
    }
    AppMethodBeat.o(76454);
    return localBundle;
  }

  public void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(76455);
    ab.i("MicroMsg.CaptureMMProxy", "class:%s, method:%s, clientCall:%B", new Object[] { getClass().getName(), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject1 = null;
    try
    {
      Method[] arrayOfMethod = getClass().getMethods();
      int i = arrayOfMethod.length;
      int j = 0;
      Object localObject2 = localObject1;
      if (j < i)
      {
        localObject2 = arrayOfMethod[j];
        if (!((Method)localObject2).getName().equalsIgnoreCase(paramString));
      }
      else
      {
        if (localObject2 == null)
          break label219;
        if (!paramBoolean)
          break label170;
        localObject1 = com.tencent.mm.remoteservice.e.class;
        label103: if (!((Method)localObject2).isAnnotationPresent((Class)localObject1))
          break label219;
        localObject1 = ((Method)localObject2).invoke(this, getArgs(paramBundle));
        if (((Method)localObject2).getReturnType() == Void.TYPE)
          break label219;
        if (!(localObject1 instanceof Parcelable))
          break label178;
        paramBundle.putParcelable("result_key", (Parcelable)localObject1);
        AppMethodBeat.o(76455);
      }
      while (true)
      {
        return;
        j++;
        break;
        label170: localObject1 = f.class;
        break label103;
        label178: if ("getConfigStorage".equals(paramString))
          ab.i("MicroMsg.CaptureMMProxy", "put result as Serializable: %s", new Object[] { (Serializable)localObject1 });
        paramBundle.putSerializable("result_key", (Serializable)localObject1);
        label219: AppMethodBeat.o(76455);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.CaptureMMProxy", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(76455);
      }
    }
  }

  public boolean set(ac.a parama, Object paramObject)
  {
    AppMethodBeat.i(76439);
    Boolean localBoolean = (Boolean)REMOTE_CALL("setConfigStorage", new Object[] { parama, paramObject });
    ab.d("MicroMsg.CaptureMMProxy", "setConfigStorage, %s %s", new Object[] { parama, paramObject });
    boolean bool = localBoolean.booleanValue();
    AppMethodBeat.o(76439);
    return bool;
  }

  @f
  public boolean setConfigStorage(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(76450);
    ac.a locala = ((ac.a[])ac.a.class.getEnumConstants())[paramInt];
    ab.i("MicroMsg.CaptureMMProxy", "setConfigStorage, %s %s", new Object[] { locala, paramObject });
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RP().Ry().set(locala, paramObject);
    AppMethodBeat.o(76450);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.CaptureMMProxy
 * JD-Core Version:    0.6.2
 */