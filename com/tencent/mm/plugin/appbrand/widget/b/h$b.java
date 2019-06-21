package com.tencent.mm.plugin.appbrand.widget.b;

import a.l;
import android.graphics.Bitmap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog$Item;", "", "subTitle", "", "title", "scope", "icon", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "check", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Z)V", "getCheck", "()Z", "setCheck", "(Z)V", "getIcon", "()Landroid/graphics/Bitmap;", "setIcon", "(Landroid/graphics/Bitmap;)V", "getScope", "()Ljava/lang/String;", "getSubTitle", "getTitle", "luggage-wechat-full-sdk_release"})
public final class h$b
{
  final String jcF;
  Bitmap jcG;
  boolean jcH;
  final String scope;
  final String title;

  private h$b(String paramString1, String paramString2, String paramString3, Bitmap paramBitmap)
  {
    this.title = paramString1;
    this.jcF = paramString2;
    this.scope = paramString3;
    this.jcG = paramBitmap;
    this.jcH = false;
  }

  public h$b(String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, byte paramByte)
  {
    this(paramString2, paramString1, paramString3, paramBitmap);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.h.b
 * JD-Core Version:    0.6.2
 */