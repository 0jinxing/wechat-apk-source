package com.tencent.mm.ui.chatting.m;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class d extends a
{
  public d(a.b paramb)
  {
    super(paramb);
  }

  final CharSequence b(Map<String, String> paramMap, String paramString, Bundle paramBundle, final WeakReference<Context> paramWeakReference)
  {
    AppMethodBeat.i(32747);
    paramBundle = (String)paramMap.get(paramString + ".title");
    paramWeakReference = new a.a(this);
    paramWeakReference.username = ((String)paramMap.get(paramString + ".username"));
    paramWeakReference.link = ((String)paramMap.get(paramString + ".qrcode"));
    paramMap = new SpannableString(paramBundle);
    paramMap.setSpan(new com.tencent.mm.plugin.messenger.a.a()
    {
      public final void onClickImp(View paramAnonymousView)
      {
        AppMethodBeat.i(32746);
        d locald = d.this;
        a.a locala = paramWeakReference;
        if ((locald.zaF != null) && (locald.zaF.get() != null))
          ((a.b)locald.zaF.get()).a(paramAnonymousView, locala);
        AppMethodBeat.o(32746);
      }
    }
    , 0, paramBundle.length(), 33);
    AppMethodBeat.o(32747);
    return paramMap;
  }

  final String dHh()
  {
    return "link_revoke_qrcode";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.d
 * JD-Core Version:    0.6.2
 */