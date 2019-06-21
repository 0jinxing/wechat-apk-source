package g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;

public final class a
{
  public int BUo;
  public byte[] BZr;
  public int BZs = 0;
  public int BZt;
  public OutputStream BZu;

  public final byte Vn(int paramInt)
  {
    int i = this.BUo - paramInt - 1;
    paramInt = i;
    if (i < 0)
      paramInt = i + this.BZs;
    return this.BZr[paramInt];
  }

  public final void eno()
  {
    AppMethodBeat.i(86235);
    enp();
    this.BZu = null;
    AppMethodBeat.o(86235);
  }

  public final void enp()
  {
    AppMethodBeat.i(86236);
    int i = this.BUo - this.BZt;
    if (i == 0)
      AppMethodBeat.o(86236);
    while (true)
    {
      return;
      this.BZu.write(this.BZr, this.BZt, i);
      if (this.BUo >= this.BZs)
        this.BUo = 0;
      this.BZt = this.BUo;
      AppMethodBeat.o(86236);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     g.a.a.a
 * JD-Core Version:    0.6.2
 */