package com.tencent.mm.modelvideo;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.b;
import com.tencent.mm.storage.z;

public final class c
{
  public static final int fUE;
  Context context;
  int duration;
  public a fUF;
  String fUG;
  final AsyncTask<String, Integer, String> fUH;
  String fileName;
  Intent intent;
  String thumbPath;
  String videoPath;

  static
  {
    AppMethodBeat.i(50628);
    fUE = b.Nd();
    AppMethodBeat.o(50628);
  }

  public c()
  {
    AppMethodBeat.i(50626);
    this.context = null;
    this.fUF = null;
    this.fUG = null;
    this.duration = 0;
    this.intent = null;
    this.fileName = null;
    this.thumbPath = null;
    this.videoPath = null;
    this.fUH = new c.1(this);
    AppMethodBeat.o(50626);
  }

  public final void a(Context paramContext, Intent paramIntent, a parama)
  {
    AppMethodBeat.i(50627);
    this.context = paramContext;
    this.intent = paramIntent;
    this.fileName = t.ug((String)g.RP().Ry().get(2, ""));
    o.all();
    this.thumbPath = t.ui(this.fileName);
    o.all();
    this.videoPath = t.uh(this.fileName);
    this.fUF = parama;
    this.fUH.execute(new String[0]);
    AppMethodBeat.o(50627);
  }

  public static abstract interface a
  {
    public abstract void b(int paramInt1, String paramString1, String paramString2, int paramInt2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.c
 * JD-Core Version:    0.6.2
 */