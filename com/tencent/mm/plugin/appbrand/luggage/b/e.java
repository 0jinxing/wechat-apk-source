package com.tencent.mm.plugin.appbrand.luggage.b;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.text.SpannableString;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.c;
import com.tencent.mm.cb.g;
import com.tencent.mm.plugin.appbrand.widget.input.a.b.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/luggage/customize/LuggageEmojiCompatByWechat;", "Lcom/tencent/mm/plugin/appbrand/widget/input/emoji/IEmojiCompat;", "()V", "getEmojiItemBySoftBank", "Lcom/tencent/mm/plugin/appbrand/widget/input/emoji/IEmojiCompat$EmojiInfo;", "codePoint", "", "getSmileySpan", "Landroid/text/SpannableString;", "context", "Landroid/content/Context;", "source", "", "sizePx", "", "plugin-appbrand-integration_release"})
public final class e
  implements com.tencent.mm.plugin.appbrand.widget.input.a.b
{
  public final SpannableString a(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    AppMethodBeat.i(134724);
    paramContext = g.dqQ().b(paramCharSequence, paramFloat);
    j.o(paramContext, "SmileyManager.getInstanc…(context, source, sizePx)");
    AppMethodBeat.o(134724);
    return paramContext;
  }

  public final b.a pe(int paramInt)
  {
    AppMethodBeat.i(134725);
    c localc = com.tencent.mm.cb.b.dqD().Mi(paramInt);
    b.a locala;
    if (localc != null)
    {
      locala = new b.a();
      locala.jik = localc.jik;
      locala.jil = localc.jil;
      locala.jim = localc.jim;
      AppMethodBeat.o(134725);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(134725);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.e
 * JD-Core Version:    0.6.2
 */