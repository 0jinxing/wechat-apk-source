package com.tencent.mm.ui.chatting.m;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class b extends a
{
  public b(a.b paramb)
  {
    super(paramb);
  }

  final CharSequence b(Map<String, String> paramMap, String paramString, Bundle paramBundle, WeakReference<Context> paramWeakReference)
  {
    AppMethodBeat.i(32742);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    String str1 = bo.bc((String)paramMap.get(paramString + ".separator"), "、");
    int i = 0;
    Object localObject1 = new StringBuilder().append(paramString).append(".memberlist.member");
    Object localObject2;
    label83: String str2;
    if (i != 0)
    {
      localObject2 = Integer.valueOf(i);
      localObject1 = localObject2;
      if (paramMap.get(localObject1) == null)
        break label264;
      if (i != 0)
        localSpannableStringBuilder.append(str1);
      localObject2 = (String)paramMap.get((String)localObject1 + ".username");
      str2 = (String)paramMap.get((String)localObject1 + ".nickname");
      if ((!bo.isNullOrNil((String)localObject2)) && (!bo.isNullOrNil(str2)))
        break label217;
      ab.w("MicroMsg.SysMsgHandlerProfile", "hy: can not resolve username or nickname");
    }
    while (true)
    {
      i++;
      break;
      localObject2 = "";
      break label83;
      label217: localObject1 = j.b(ah.getContext(), str2);
      ((SpannableString)localObject1).setSpan(new b.1(this, paramWeakReference, paramBundle, (String)localObject2), 0, str2.length(), 33);
      localSpannableStringBuilder.append((CharSequence)localObject1);
    }
    label264: AppMethodBeat.o(32742);
    return localSpannableStringBuilder;
  }

  final String dHh()
  {
    return "link_profile";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.b
 * JD-Core Version:    0.6.2
 */