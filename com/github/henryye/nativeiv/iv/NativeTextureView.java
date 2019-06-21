package com.github.henryye.nativeiv.iv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class NativeTextureView extends TextureView
{
  public NativeTextureView(Context paramContext)
  {
    this(paramContext, null);
  }

  public NativeTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public NativeTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static void pB()
  {
    AppMethodBeat.i(115771);
    c.c.i("Ni.NativeTextureView", "hy: clearing native surface", new Object[0]);
    AppMethodBeat.o(115771);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.iv.NativeTextureView
 * JD-Core Version:    0.6.2
 */