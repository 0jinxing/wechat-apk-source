package com.bumptech.glide.c.d.e;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.bumptech.glide.b.d;
import com.bumptech.glide.c.f;
import com.bumptech.glide.c.j;
import com.bumptech.glide.c.k;
import com.bumptech.glide.c.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.List;

public final class a
  implements k<ByteBuffer, c>
{
  private static final a aFP;
  private static final a.b aFQ;
  private final a.b aFR;
  private final a aFS;
  private final b aFT;
  private final List<f> azH;
  private final Context context;

  static
  {
    AppMethodBeat.i(92306);
    aFP = new a();
    aFQ = new a.b();
    AppMethodBeat.o(92306);
  }

  public a(Context paramContext, List<f> paramList, com.bumptech.glide.c.b.a.e parame, com.bumptech.glide.c.b.a.b paramb)
  {
    this(paramContext, paramList, parame, paramb, aFQ, aFP);
  }

  private a(Context paramContext, List<f> paramList, com.bumptech.glide.c.b.a.e parame, com.bumptech.glide.c.b.a.b paramb, a.b paramb1, a parama)
  {
    AppMethodBeat.i(92301);
    this.context = paramContext.getApplicationContext();
    this.azH = paramList;
    this.aFS = parama;
    this.aFT = new b(parame, paramb);
    this.aFR = paramb1;
    AppMethodBeat.o(92301);
  }

  private e a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, d paramd, j paramj)
  {
    AppMethodBeat.i(92303);
    long l = com.bumptech.glide.h.e.ok();
    try
    {
      if (paramd.aym == null)
      {
        paramByteBuffer = new java/lang/IllegalStateException;
        paramByteBuffer.<init>("You must call setData() before parseHeader()");
        AppMethodBeat.o(92303);
        throw paramByteBuffer;
      }
    }
    finally
    {
      if (Log.isLoggable("BufferGifDecoder", 2))
        new StringBuilder("Decoded GIF from stream in ").append(com.bumptech.glide.h.e.q(l));
      AppMethodBeat.o(92303);
    }
    if (!paramd.md())
    {
      paramd.ma();
      if (!paramd.md())
      {
        paramd.lY();
        if (paramd.ayn.frameCount < 0)
          paramd.ayn.status = 1;
      }
    }
    Object localObject = paramd.ayn;
    int i;
    if (((com.bumptech.glide.b.c)localObject).frameCount > 0)
    {
      i = ((com.bumptech.glide.b.c)localObject).status;
      if (i == 0);
    }
    else
    {
      if (Log.isLoggable("BufferGifDecoder", 2))
        new StringBuilder("Decoded GIF from stream in ").append(com.bumptech.glide.h.e.q(l));
      paramByteBuffer = null;
      AppMethodBeat.o(92303);
    }
    while (true)
    {
      return paramByteBuffer;
      if (paramj.a(i.aFl) == com.bumptech.glide.c.b.ayL)
      {
        paramd = Bitmap.Config.RGB_565;
        label198: i = Math.min(((com.bumptech.glide.b.c)localObject).height / paramInt2, ((com.bumptech.glide.b.c)localObject).width / paramInt1);
        if (i != 0)
          break label413;
      }
      label413: for (i = 0; ; i = Integer.highestOneBit(i))
      {
        i = Math.max(1, i);
        if ((Log.isLoggable("BufferGifDecoder", 2)) && (i > 1))
        {
          paramj = new java/lang/StringBuilder;
          paramj.<init>("Downsampling GIF, sampleSize: ");
          paramj.append(i).append(", target dimens: [").append(paramInt1).append("x").append(paramInt2).append("], actual dimens: [").append(((com.bumptech.glide.b.c)localObject).width).append("x").append(((com.bumptech.glide.b.c)localObject).height).append("]");
        }
        b localb = this.aFT;
        paramj = new com/bumptech/glide/b/e;
        paramj.<init>(localb, (com.bumptech.glide.b.c)localObject, paramByteBuffer, i);
        paramj.a(paramd);
        paramj.advance();
        paramByteBuffer = paramj.lX();
        if (paramByteBuffer != null)
          break label423;
        if (Log.isLoggable("BufferGifDecoder", 2))
          new StringBuilder("Decoded GIF from stream in ").append(com.bumptech.glide.h.e.q(l));
        paramByteBuffer = null;
        AppMethodBeat.o(92303);
        break;
        paramd = Bitmap.Config.ARGB_8888;
        break label198;
      }
      label423: localObject = com.bumptech.glide.c.d.b.nm();
      paramd = new com/bumptech/glide/c/d/e/c;
      paramd.<init>(this.context, paramj, (m)localObject, paramInt1, paramInt2, paramByteBuffer);
      paramByteBuffer = new e(paramd);
      if (Log.isLoggable("BufferGifDecoder", 2))
        new StringBuilder("Decoded GIF from stream in ").append(com.bumptech.glide.h.e.q(l));
      AppMethodBeat.o(92303);
    }
  }

  private e a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, j paramj)
  {
    AppMethodBeat.i(92302);
    d locald = this.aFR.c(paramByteBuffer);
    try
    {
      paramByteBuffer = a(paramByteBuffer, paramInt1, paramInt2, locald, paramj);
      return paramByteBuffer;
    }
    finally
    {
      this.aFR.a(locald);
      AppMethodBeat.o(92302);
    }
    throw paramByteBuffer;
  }

  static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.e.a
 * JD-Core Version:    0.6.2
 */