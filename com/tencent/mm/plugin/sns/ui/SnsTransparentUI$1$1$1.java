package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.model.t;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import java.io.ByteArrayOutputStream;
import java.util.Map;

final class SnsTransparentUI$1$1$1
  implements f.a
{
  SnsTransparentUI$1$1$1(SnsTransparentUI.1.1 param1, WXMediaMessage paramWXMediaMessage, String paramString)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(39631);
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeFile(paramString);
      SnsTransparentUI.a(this.rBK.rBI.rBH).put(this.rBK.rBI.rBD, localBitmap);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        ab.i("SnsTransparentUI", "thumb image is not null");
        paramString = new java/io/ByteArrayOutputStream;
        paramString.<init>();
        localBitmap.compress(Bitmap.CompressFormat.PNG, 100, paramString);
        this.rBJ.thumbData = paramString.toByteArray();
      }
      paramString = new com/tencent/mm/g/a/py;
      paramString.<init>();
      paramString.cMe.cEl = this.rBJ;
      paramString.cMe.toUser = this.rBK.cgl;
      paramString.cMe.cMf = 49;
      paramString.cMe.cMg = "";
      paramString.cMe.cMh = "";
      paramString.cMe.cMn = this.rBK.rBI.rBG;
      a.xxA.m(paramString);
      if (!TextUtils.isEmpty(this.val$text))
      {
        paramString = new com/tencent/mm/g/a/qb;
        paramString.<init>();
        paramString.cMq.cMr = this.rBK.cgl;
        paramString.cMq.content = this.val$text;
        paramString.cMq.type = t.nK(this.rBK.cgl);
        paramString.cMq.flags = 0;
        a.xxA.m(paramString);
      }
      h.bQ(this.rBK.val$context, this.rBK.val$context.getString(2131297050));
      this.rBK.rBI.rBH.finish();
      AppMethodBeat.o(39631);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("SnsTransparentUI", "this has a error : " + paramString.toString());
        this.rBK.rBI.rBH.finish();
        AppMethodBeat.o(39631);
      }
    }
  }

  public final void cmD()
  {
    AppMethodBeat.i(39630);
    h.bQ(this.rBK.val$context, this.rBK.val$context.getString(2131303492));
    this.rBK.rBI.rBH.finish();
    AppMethodBeat.o(39630);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTransparentUI.1.1.1
 * JD-Core Version:    0.6.2
 */