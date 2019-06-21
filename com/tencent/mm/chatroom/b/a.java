package com.tencent.mm.chatroom.b;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.e.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class a
  implements e.b
{
  public com.tencent.mm.chatroom.d.a ehc;

  public a()
  {
    AppMethodBeat.i(103900);
    this.ehc = new com.tencent.mm.chatroom.d.a();
    AppMethodBeat.o(103900);
  }

  public final CharSequence a(Map<String, String> paramMap, String paramString, Bundle paramBundle, WeakReference<Context> paramWeakReference)
  {
    AppMethodBeat.i(103901);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    paramMap = (String)paramMap.get(paramString + ".title");
    if (bo.isNullOrNil(paramMap))
    {
      paramMap = "";
      AppMethodBeat.o(103901);
    }
    while (true)
    {
      return paramMap;
      paramString = j.b(ah.getContext(), paramMap);
      paramString.setSpan(new a.1(this, paramWeakReference, paramBundle), 0, paramMap.length(), 33);
      localSpannableStringBuilder.append(paramString);
      AppMethodBeat.o(103901);
      paramMap = localSpannableStringBuilder;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.b.a
 * JD-Core Version:    0.6.2
 */