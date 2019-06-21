package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.b.b;

public final class h extends a
{
  CharSequence mKB;
  private h.b mKC;
  h.a mKD;

  public h(int paramInt)
  {
    super(17, paramInt);
    AppMethodBeat.i(61993);
    this.mKC = new h.b(this, (byte)0);
    this.mKD = new h.a(this, (byte)0);
    AppMethodBeat.o(61993);
  }

  public final a.b Ps()
  {
    return this.mKC;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61994);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    for (Object localObject : this.mDz.mEa)
    {
      parama = new SpannableString(localObject);
      parama.setSpan(new ForegroundColorSpan(b.b.mHr), 0, localObject.length(), 33);
      localSpannableStringBuilder.append(parama);
      localSpannableStringBuilder.append("、");
    }
    this.mKB = TextUtils.concat(new CharSequence[] { paramContext.getString(2131302899), localSpannableStringBuilder.subSequence(0, localSpannableStringBuilder.length() - 1), paramContext.getString(2131302898) });
    AppMethodBeat.o(61994);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.h
 * JD-Core Version:    0.6.2
 */