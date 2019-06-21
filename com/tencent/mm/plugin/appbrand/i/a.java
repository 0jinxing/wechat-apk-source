package com.tencent.mm.plugin.appbrand.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.j;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.r.o;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.neattextview.textview.view.NeatTextView;
import java.lang.ref.WeakReference;

public class a
  implements j
{
  private static SpannableString a(Context paramContext, int paramInt, Bitmap paramBitmap)
  {
    AppMethodBeat.i(132269);
    if (paramBitmap == null)
      if (paramInt == 1)
        paramInt = 2131232002;
    for (paramContext = paramContext.getResources().getDrawable(paramInt); ; paramContext = new BitmapDrawable(paramContext.getResources(), paramBitmap))
    {
      paramContext.setBounds(0, 0, o.aNT(), o.aNT());
      paramContext = new com.tencent.mm.plugin.appbrand.widget.h.b(paramContext);
      paramBitmap = new SpannableString("@ ");
      paramBitmap.setSpan(paramContext, 0, 1, 33);
      AppMethodBeat.o(132269);
      return paramBitmap;
      paramInt = 2131232001;
      break;
    }
  }

  public final CharSequence a(String paramString, Bundle paramBundle, WeakReference<Context> paramWeakReference, WeakReference<NeatTextView> paramWeakReference1)
  {
    AppMethodBeat.i(132268);
    com.tencent.mm.af.a.a locala = com.tencent.mm.af.a.a.mk(paramString);
    Context localContext = (Context)paramWeakReference.get();
    if (localContext == null)
    {
      ab.w("MicroMsg.WxaSubscribeMsgService", "context is null");
      paramString = null;
      AppMethodBeat.o(132268);
    }
    while (true)
    {
      return paramString;
      paramString = locala.content;
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.WxaSubscribeMsgService", "content is null, return");
        paramString = null;
        AppMethodBeat.o(132268);
      }
      else
      {
        Object localObject = paramBundle.getString("conv_talker_username");
        int i = paramBundle.getInt("scene");
        long l = paramBundle.getLong("msg_sever_id");
        String str = paramBundle.getString("send_msg_username");
        paramBundle = new SpannableString(paramString);
        paramBundle.setSpan(new a.1(this, locala, (String)localObject, i, l, str), paramString.indexOf(locala.title), paramString.indexOf(locala.title) + locala.title.length(), 17);
        ab.i("MicroMsg.WxaSubscribeMsgService", "wxaSubscribeSysContent.forbids:%d", new Object[] { Integer.valueOf(locala.fjV) });
        if (locala.fjV == 1)
        {
          AppMethodBeat.o(132268);
          paramString = paramBundle;
        }
        else
        {
          paramString = ((d)g.K(d.class)).zb(locala.username);
          if (paramString != null);
          for (paramString = paramString.field_brandIconURL; ; paramString = "")
          {
            localObject = com.tencent.mm.modelappbrand.a.b.abR().a(paramString, null);
            if (localObject != null)
              break label308;
            com.tencent.mm.modelappbrand.a.b.abR().a(new a.2(this, paramWeakReference1, paramWeakReference, paramBundle), paramString, null);
            paramString = TextUtils.concat(new CharSequence[] { a(localContext, locala.fjW, null), paramBundle });
            AppMethodBeat.o(132268);
            break;
          }
          label308: paramString = TextUtils.concat(new CharSequence[] { a(localContext, locala.fjW, (Bitmap)localObject), paramBundle });
          AppMethodBeat.o(132268);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.a
 * JD-Core Version:    0.6.2
 */