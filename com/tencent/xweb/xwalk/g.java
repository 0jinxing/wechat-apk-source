package com.tencent.xweb.xwalk;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.e;
import com.tencent.xweb.h;
import org.xwalk.core.XWalkView;

public final class g
  implements e
{
  l ARX;
  m ARY;
  XWalkView ARZ;

  public g(XWalkView paramXWalkView)
  {
    AppMethodBeat.i(85230);
    this.ARZ = paramXWalkView;
    this.ARX = new l(paramXWalkView);
    this.ARY = new m(paramXWalkView);
    AppMethodBeat.o(85230);
  }

  public final boolean a(String paramString1, String paramString2, h paramh)
  {
    AppMethodBeat.i(85234);
    boolean bool;
    if ((paramh instanceof f.c))
    {
      bool = this.ARX.b(this.ARZ, paramString1, paramString2, ((f.c)paramh).ARV);
      AppMethodBeat.o(85234);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85234);
    }
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, com.tencent.xweb.g paramg)
  {
    AppMethodBeat.i(85236);
    boolean bool;
    if ((paramg instanceof f.d))
    {
      bool = this.ARX.a(this.ARZ, paramString1, paramString2, paramString3, ((f.d)paramg).ARV);
      AppMethodBeat.o(85236);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85236);
    }
  }

  public final boolean b(String paramString1, String paramString2, h paramh)
  {
    AppMethodBeat.i(85235);
    boolean bool;
    if ((paramh instanceof f.c))
    {
      bool = this.ARX.a(this.ARZ, paramString1, paramString2, ((f.c)paramh).ARV);
      AppMethodBeat.o(85235);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85235);
    }
  }

  public final void onHideCustomView()
  {
    AppMethodBeat.i(85233);
    this.ARX.dVA();
    AppMethodBeat.o(85233);
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(85232);
    if ((paramCustomViewCallback instanceof f.a))
      this.ARX.a(paramView, ((f.a)paramCustomViewCallback).ART);
    AppMethodBeat.o(85232);
  }

  public final void w(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(85231);
    this.ARX.a(this.ARZ, paramString);
    AppMethodBeat.o(85231);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.g
 * JD-Core Version:    0.6.2
 */