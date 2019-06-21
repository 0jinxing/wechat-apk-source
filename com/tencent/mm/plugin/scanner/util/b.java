package com.tencent.mm.plugin.scanner.util;

import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.qbar.QbarNative;

public abstract class b
{
  protected static int qhm = 0;
  protected int cvn;
  protected int cvo;
  protected b.a qhj = null;
  protected byte[] qhk = null;
  public String qhl;
  protected long qhn;
  public boolean[] qho = null;
  protected byte[] rawData = null;

  public b(b.a parama)
  {
    this.qhj = parama;
  }

  public final void a(final byte[] paramArrayOfByte, final Point paramPoint, final int paramInt, final Rect paramRect)
  {
    ab.d("MicroMsg.scanner.BaseDecoder", "decode task reach");
    d.f(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(81372);
        byte[] arrayOfByte1 = paramArrayOfByte;
        if (270 == paramInt)
        {
          byte[] arrayOfByte2 = new byte[paramArrayOfByte.length];
          QbarNative.a(arrayOfByte2, paramArrayOfByte, paramPoint.x, paramPoint.y);
          arrayOfByte1 = new byte[paramArrayOfByte.length];
          QbarNative.a(arrayOfByte1, arrayOfByte2, paramPoint.y, paramPoint.x);
          QbarNative.nativeRelease();
        }
        ab.d("MicroMsg.scanner.BaseDecoder", "asyncDecode() resolution:%s, coverage:%s", new Object[] { paramPoint.toString(), paramRect.toString() });
        if ((arrayOfByte1 != null) && (b.this.a(arrayOfByte1, paramPoint, paramRect)))
        {
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(81370);
              if (b.this.qhj != null)
                b.this.qhj.b(b.qhm, b.this.qhl, b.this.rawData, b.this.qhk, b.this.cvn, b.this.cvo);
              AppMethodBeat.o(81370);
            }
          });
          AppMethodBeat.o(81372);
        }
        while (true)
        {
          return;
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(81371);
              if (b.this.qhj != null)
              {
                ab.d("MicroMsg.scanner.BaseDecoder", "failed in asyncDecode() resolution:%s, coverage:%s", new Object[] { b.1.this.qft.toString(), b.1.this.qfu.toString() });
                b.this.qhj.jJ(b.this.qhn);
              }
              AppMethodBeat.o(81371);
            }
          });
          AppMethodBeat.o(81372);
        }
      }
    }
    , "scan_decode");
  }

  public abstract boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect);

  public abstract void chP();

  public abstract void sI();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.b
 * JD-Core Version:    0.6.2
 */