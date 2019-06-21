package e.a.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.a.a.b;
import java.util.LinkedList;

public final class a
{
  public final e.a.a.b.a.a BTU;
  public int BTV;
  private final b unknownTagHandler;

  public a(byte[] paramArrayOfByte, b paramb)
  {
    AppMethodBeat.i(51865);
    this.BTV = 0;
    this.BTU = new e.a.a.b.a.a(paramArrayOfByte, paramArrayOfByte.length);
    this.unknownTagHandler = paramb;
    AppMethodBeat.o(51865);
  }

  public final LinkedList<byte[]> Vh(int paramInt)
  {
    AppMethodBeat.i(51870);
    LinkedList localLinkedList = this.BTU.Vh(paramInt);
    AppMethodBeat.o(51870);
    return localLinkedList;
  }

  public final int emp()
  {
    AppMethodBeat.i(51866);
    int i = this.BTU.vd();
    AppMethodBeat.o(51866);
    return i;
  }

  public final String emq()
  {
    AppMethodBeat.i(138405);
    String str = this.BTU.readString();
    AppMethodBeat.o(138405);
    return str;
  }

  public final boolean emr()
  {
    AppMethodBeat.i(138406);
    boolean bool = this.BTU.ehX();
    AppMethodBeat.o(138406);
    return bool;
  }

  public final void ems()
  {
    AppMethodBeat.i(51869);
    int i = e.a.a.b.a.fy(this.BTV);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("FieldNumber: ").append(e.a.a.b.a.fz(this.BTV)).append(" - ");
    switch (i)
    {
    case 3:
    case 4:
    default:
    case 5:
    case 1:
    case 2:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(51869);
      while (true)
      {
        return;
        localStringBuffer.append("float value: ").append(Float.toString(Float.intBitsToFloat(this.BTU.eia())));
        AppMethodBeat.o(51869);
        continue;
        localStringBuffer.append("double value: ").append(Double.toString(Double.longBitsToDouble(this.BTU.eib())));
        AppMethodBeat.o(51869);
        continue;
        localStringBuffer.append("Length delimited (String or ByteString) value: ").append(this.BTU.readString());
        AppMethodBeat.o(51869);
      }
      localStringBuffer.append("varint (long, int or boolean) value: ").append(this.BTU.ve());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     e.a.a.a.a
 * JD-Core Version:    0.6.2
 */