package org.xwalk.core.resource;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.view.ViewStub;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.Log;

final class XWalkContextWrapper$XWalkLayoutInflaterFactory
  implements LayoutInflater.Factory
{
  LayoutInflater layoutInflater;

  private View createView(String paramString1, String paramString2, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(86211);
    Object localObject = null;
    try
    {
      paramString1 = this.layoutInflater.createView(paramString1, paramString2, paramAttributeSet);
      AppMethodBeat.o(86211);
      return paramString1;
    }
    catch (ClassNotFoundException paramString1)
    {
      while (true)
        paramString1 = localObject;
    }
    catch (InflateException paramString1)
    {
      while (true)
        paramString1 = localObject;
    }
  }

  public final View inflateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    Object localObject = null;
    AppMethodBeat.i(86210);
    if (paramString.indexOf(".") == -1)
    {
      if (paramString.equals("WebView"))
        localObject = createView(paramString, "android.webkit.", paramAttributeSet);
      paramContext = (Context)localObject;
      if (localObject == null)
        paramContext = createView(paramString, "android.widget.", paramAttributeSet);
      localObject = paramContext;
      if (paramContext != null);
    }
    for (localObject = createView(paramString, "android.view.", paramAttributeSet); ; localObject = this.layoutInflater.createView(paramString, null, paramAttributeSet))
    {
      AppMethodBeat.o(86210);
      return localObject;
    }
  }

  public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(86209);
    AttributeSet localAttributeSet1 = null;
    AttributeSet localAttributeSet2 = null;
    try
    {
      paramAttributeSet = inflateView(paramString, paramContext, paramAttributeSet);
      paramContext = paramAttributeSet;
      localAttributeSet2 = paramAttributeSet;
      localAttributeSet1 = paramAttributeSet;
      if ((paramAttributeSet instanceof ViewStub))
      {
        paramContext = paramAttributeSet;
        localAttributeSet2 = paramAttributeSet;
        localAttributeSet1 = paramAttributeSet;
        if (Build.VERSION.SDK_INT >= 21)
        {
          localAttributeSet2 = paramAttributeSet;
          localAttributeSet1 = paramAttributeSet;
          ((ViewStub)paramAttributeSet).setLayoutInflater(this.layoutInflater);
          paramContext = paramAttributeSet;
        }
      }
      AppMethodBeat.o(86209);
      return paramContext;
    }
    catch (ClassNotFoundException paramContext)
    {
      while (true)
      {
        Log.w("XWalkLib", String.format("[XWalkContextWrapper] class not found. name:%s. Use default Inflate.", new Object[] { paramString }));
        paramContext = localAttributeSet2;
      }
    }
    catch (InflateException paramContext)
    {
      while (true)
      {
        Log.w("XWalkLib", String.format("[XWalkContextWrapper] Inflate failed. name:%s. Use default Inflate.", new Object[] { paramString }));
        paramContext = localAttributeSet1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.resource.XWalkContextWrapper.XWalkLayoutInflaterFactory
 * JD-Core Version:    0.6.2
 */