package com.tencent.mm.openim.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.widget.TextView;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.c.a;

public abstract interface b extends f, a
{
  public abstract CharSequence a(Context paramContext, CharSequence paramCharSequence);

  public abstract CharSequence a(Context paramContext, String paramString1, String paramString2, float paramFloat);

  public abstract String a(String paramString1, String paramString2, b.a parama);

  public abstract void a(Context paramContext, TextView paramTextView, CharSequence paramCharSequence);

  public abstract void a(Context paramContext, TextView paramTextView, CharSequence paramCharSequence, String paramString1, String paramString2, int paramInt);

  public abstract void aZ(String paramString1, String paramString2);

  public abstract void anw();

  public abstract String b(String paramString1, String paramString2, b.a parama);

  public abstract String ba(String paramString1, String paramString2);

  public abstract String c(String paramString1, String paramString2, b.a parama);

  public abstract SpannableString e(Context paramContext, String paramString, int paramInt);

  public abstract void u(String paramString1, String paramString2, String paramString3);

  public abstract Bitmap vh(String paramString);

  public abstract int vi(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.a.b
 * JD-Core Version:    0.6.2
 */