package com.google.android.exoplayer2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.exoplayer2.b.d;
import com.google.android.exoplayer2.f.a;
import com.google.android.exoplayer2.f.j.a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.e.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

final class v$a
  implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, com.google.android.exoplayer2.a.e, j.a, e.a, com.google.android.exoplayer2.video.e
{
  private v$a(v paramv)
  {
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(95393);
    this.aPa.aOV = paramd;
    if (this.aPa.aOU != null)
      this.aPa.aOU.a(paramd);
    AppMethodBeat.o(95393);
  }

  public final void b(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    AppMethodBeat.i(95395);
    Iterator localIterator = this.aPa.aOH.iterator();
    while (localIterator.hasNext())
      localIterator.next();
    if (this.aPa.aOU != null)
      this.aPa.aOU.b(paramInt1, paramInt2, paramInt3, paramFloat);
    AppMethodBeat.o(95395);
  }

  public final void b(d paramd)
  {
    AppMethodBeat.i(95397);
    if (this.aPa.aOU != null)
      this.aPa.aOU.b(paramd);
    this.aPa.aOM = null;
    this.aPa.aOV = null;
    AppMethodBeat.o(95397);
  }

  public final void b(Metadata paramMetadata)
  {
    AppMethodBeat.i(95405);
    Iterator localIterator = this.aPa.aOJ.iterator();
    while (localIterator.hasNext())
      ((e.a)localIterator.next()).b(paramMetadata);
    AppMethodBeat.o(95405);
  }

  public final void b(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95400);
    if (this.aPa.aOT != null)
      this.aPa.aOT.b(paramString, paramLong1, paramLong2);
    AppMethodBeat.o(95400);
  }

  public final void c(Surface paramSurface)
  {
    AppMethodBeat.i(95396);
    if (this.aPa.aOO == paramSurface)
    {
      Iterator localIterator = this.aPa.aOH.iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
    if (this.aPa.aOU != null)
      this.aPa.aOU.c(paramSurface);
    AppMethodBeat.o(95396);
  }

  public final void c(Format paramFormat)
  {
    AppMethodBeat.i(95394);
    this.aPa.aOM = paramFormat;
    if (this.aPa.aOU != null)
      this.aPa.aOU.c(paramFormat);
    AppMethodBeat.o(95394);
  }

  public final void c(d paramd)
  {
    AppMethodBeat.i(95398);
    this.aPa.aOW = paramd;
    if (this.aPa.aOT != null)
      this.aPa.aOT.c(paramd);
    AppMethodBeat.o(95398);
  }

  public final void d(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95402);
    if (this.aPa.aOT != null)
      this.aPa.aOT.d(paramInt, paramLong1, paramLong2);
    AppMethodBeat.o(95402);
  }

  public final void d(Format paramFormat)
  {
    AppMethodBeat.i(95401);
    this.aPa.aON = paramFormat;
    if (this.aPa.aOT != null)
      this.aPa.aOT.d(paramFormat);
    AppMethodBeat.o(95401);
  }

  public final void d(d paramd)
  {
    AppMethodBeat.i(95403);
    if (this.aPa.aOT != null)
      this.aPa.aOT.d(paramd);
    this.aPa.aON = null;
    this.aPa.aOW = null;
    this.aPa.aOX = 0;
    AppMethodBeat.o(95403);
  }

  public final void dx(int paramInt)
  {
    AppMethodBeat.i(95399);
    this.aPa.aOX = paramInt;
    if (this.aPa.aOT != null)
      this.aPa.aOT.dx(paramInt);
    AppMethodBeat.o(95399);
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95408);
    v.a(this.aPa, new Surface(paramSurfaceTexture), true);
    AppMethodBeat.o(95408);
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(95409);
    v.a(this.aPa, null, true);
    AppMethodBeat.o(95409);
    return true;
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }

  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(95406);
    v.a(this.aPa, paramSurfaceHolder.getSurface(), false);
    AppMethodBeat.o(95406);
  }

  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(95407);
    v.a(this.aPa, null, false);
    AppMethodBeat.o(95407);
  }

  public final void t(List<a> paramList)
  {
    AppMethodBeat.i(95404);
    Iterator localIterator = this.aPa.aOI.iterator();
    while (localIterator.hasNext())
      ((j.a)localIterator.next()).t(paramList);
    AppMethodBeat.o(95404);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.v.a
 * JD-Core Version:    0.6.2
 */