package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.b.b;

public final class g extends a
{
  private CharSequence mKB;
  private a.b zpZ;
  a.a zqa;

  public g(int paramInt)
  {
    super(5, paramInt);
    AppMethodBeat.i(105291);
    this.zpZ = new g.b(this);
    this.zqa = new g.a(this);
    AppMethodBeat.o(105291);
  }

  public final void a(Context paramContext, a.a parama)
  {
    AppMethodBeat.i(105292);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    for (CharSequence localCharSequence : this.mDz.mEa)
    {
      SpannableString localSpannableString = new SpannableString(localCharSequence);
      localSpannableString.setSpan(new ForegroundColorSpan(b.b.mHr), 0, localCharSequence.length(), 33);
      localSpannableStringBuilder.append(localSpannableString);
      localSpannableStringBuilder.append("、");
    }
    this.mKB = TextUtils.concat(new CharSequence[] { paramContext.getString(2131302874), localSpannableStringBuilder.subSequence(0, localSpannableStringBuilder.length() - 1), paramContext.getString(2131302874) });
    AppMethodBeat.o(105292);
  }

  public final a.b aou()
  {
    return this.zpZ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.g
 * JD-Core Version:    0.6.2
 */