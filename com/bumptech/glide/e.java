package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.c.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class e extends ContextWrapper
{
  static final k<?, ?> awz;
  private final Handler awA;
  private final com.bumptech.glide.f.a.b awB;
  final j awe;
  public final h awj;
  public final com.bumptech.glide.c.b.a.b awk;
  final Map<Class<?>, k<?, ?>> awp;
  public final int awu;
  final com.bumptech.glide.f.e awv;

  static
  {
    AppMethodBeat.i(91614);
    awz = new b();
    AppMethodBeat.o(91614);
  }

  public e(Context paramContext, com.bumptech.glide.c.b.a.b paramb, h paramh, com.bumptech.glide.f.a.b paramb1, com.bumptech.glide.f.e parame, Map<Class<?>, k<?, ?>> paramMap, j paramj, int paramInt)
  {
    super(paramContext.getApplicationContext());
    AppMethodBeat.i(91613);
    this.awk = paramb;
    this.awj = paramh;
    this.awB = paramb1;
    this.awv = parame;
    this.awp = paramMap;
    this.awe = paramj;
    this.awu = paramInt;
    this.awA = new Handler(Looper.getMainLooper());
    AppMethodBeat.o(91613);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.e
 * JD-Core Version:    0.6.2
 */