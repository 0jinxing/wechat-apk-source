package com.tencent.mm.remoteservice;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class a extends b.a
{
  private final d ext;
  protected RemoteService xtU;
  public b xtV;

  public a(d paramd)
  {
    this.ext = paramd;
  }

  public Object CLIENT_CALL(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80219);
    paramArrayOfObject = objectsToBundle(paramArrayOfObject);
    try
    {
      this.xtV.onCallback(paramString, paramArrayOfObject, true);
      paramString = paramArrayOfObject.get("result_key");
      AppMethodBeat.o(80219);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.e("MicroMsg.BaseClientRequest", "exception:%s", new Object[] { bo.l(paramString) });
    }
  }

  public Object REMOTE_CALL(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80218);
    if (this.ext.isConnected())
    {
      paramArrayOfObject = objectsToBundle(paramArrayOfObject);
      this.ext.a(this, paramString, paramArrayOfObject);
      paramArrayOfObject.setClassLoader(getClass().getClassLoader());
      paramString = paramArrayOfObject.get("result_key");
      AppMethodBeat.o(80218);
    }
    while (true)
    {
      return paramString;
      this.ext.connect(new a.1(this, paramArrayOfObject, paramString));
      paramString = null;
      AppMethodBeat.o(80218);
    }
  }

  public Object[] getArgs(Bundle paramBundle)
  {
    AppMethodBeat.i(80221);
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    int j = paramBundle.size();
    while (i < j)
    {
      String str = String.valueOf(i);
      if (paramBundle.containsKey(str))
        localLinkedList.add(paramBundle.get(str));
      i++;
    }
    paramBundle = localLinkedList.toArray();
    AppMethodBeat.o(80221);
    return paramBundle;
  }

  protected Bundle objectsToBundle(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80220);
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
          localBundle.putParcelable(String.valueOf(j), (Parcelable)paramArrayOfObject[j]);
        else
          localBundle.putSerializable(String.valueOf(j), (Serializable)paramArrayOfObject[j]);
      }
    }
    AppMethodBeat.o(80220);
    return localBundle;
  }

  public void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(80217);
    ab.d("MicroMsg.BaseClientRequest", "class:%s, method:%s, clientCall:%B", new Object[] { getClass().getName(), paramString, Boolean.valueOf(paramBoolean) });
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
      else if (localObject2 != null)
      {
        if (!paramBoolean)
          break label153;
      }
      label153: for (paramString = e.class; ; paramString = f.class)
      {
        if (((Method)localObject2).isAnnotationPresent(paramString))
        {
          paramString = ((Method)localObject2).invoke(this, getArgs(paramBundle));
          if (((Method)localObject2).getReturnType() != Void.TYPE)
            paramBundle.putSerializable("result_key", (Serializable)paramString);
        }
        AppMethodBeat.o(80217);
        return;
        j++;
        break;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.BaseClientRequest", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(80217);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.a
 * JD-Core Version:    0.6.2
 */