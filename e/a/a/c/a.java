package e.a.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.io.OutputStream;
import java.util.LinkedList;

public final class a
{
  public final byte[] BTW;
  private final e.a.a.b.b.a BTX;
  public final OutputStream output;

  public a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51910);
    this.BTW = paramArrayOfByte;
    this.output = null;
    this.BTX = new e.a.a.b.b.a(paramArrayOfByte, paramArrayOfByte.length);
    AppMethodBeat.o(51910);
  }

  public final void aO(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(51911);
    this.BTX.aN(paramInt, paramBoolean);
    AppMethodBeat.o(51911);
  }

  public final void ai(int paramInt, long paramLong)
  {
    AppMethodBeat.i(51917);
    this.BTX.m(paramInt, paramLong);
    AppMethodBeat.o(51917);
  }

  public final void c(int paramInt, b paramb)
  {
    AppMethodBeat.i(51912);
    this.BTX.a(paramInt, paramb);
    AppMethodBeat.o(51912);
  }

  public final void e(int paramInt1, int paramInt2, LinkedList<?> paramLinkedList)
  {
    AppMethodBeat.i(51920);
    if (paramLinkedList != null)
      switch (paramInt2)
      {
      default:
        paramLinkedList = new IllegalArgumentException("The data type was not found, the id used was ".concat(String.valueOf(paramInt2)));
        AppMethodBeat.o(51920);
        throw paramLinkedList;
      case 6:
        paramInt2 = 0;
        if (paramInt2 >= paramLinkedList.size())
          AppMethodBeat.o(51920);
        break;
      case 4:
      case 5:
      case 2:
      case 3:
      case 1:
      case 7:
      case 8:
      }
    while (true)
    {
      return;
      c(paramInt1, (b)paramLinkedList.get(paramInt2));
      paramInt2++;
      break;
      for (paramInt2 = 0; ; paramInt2++)
      {
        if (paramInt2 >= paramLinkedList.size())
        {
          AppMethodBeat.o(51920);
          break;
        }
        f(paramInt1, ((Double)paramLinkedList.get(paramInt2)).doubleValue());
      }
      for (paramInt2 = 0; ; paramInt2++)
      {
        if (paramInt2 >= paramLinkedList.size())
        {
          AppMethodBeat.o(51920);
          break;
        }
        r(paramInt1, ((Float)paramLinkedList.get(paramInt2)).floatValue());
      }
      for (paramInt2 = 0; ; paramInt2++)
      {
        if (paramInt2 >= paramLinkedList.size())
        {
          AppMethodBeat.o(51920);
          break;
        }
        iz(paramInt1, ((Integer)paramLinkedList.get(paramInt2)).intValue());
      }
      for (paramInt2 = 0; ; paramInt2++)
      {
        if (paramInt2 >= paramLinkedList.size())
        {
          AppMethodBeat.o(51920);
          break;
        }
        ai(paramInt1, ((Long)paramLinkedList.get(paramInt2)).longValue());
      }
      for (paramInt2 = 0; ; paramInt2++)
      {
        if (paramInt2 >= paramLinkedList.size())
        {
          AppMethodBeat.o(51920);
          break;
        }
        e(paramInt1, (String)paramLinkedList.get(paramInt2));
      }
      for (paramInt2 = 0; ; paramInt2++)
      {
        if (paramInt2 >= paramLinkedList.size())
        {
          AppMethodBeat.o(51920);
          break;
        }
        aO(paramInt1, ((Boolean)paramLinkedList.get(paramInt2)).booleanValue());
      }
      for (paramInt2 = 0; ; paramInt2++)
      {
        if (paramInt2 >= paramLinkedList.size())
        {
          AppMethodBeat.o(51920);
          break;
        }
        com.tencent.mm.bt.a locala = (com.tencent.mm.bt.a)paramLinkedList.get(paramInt2);
        iy(paramInt1, locala.computeSize());
        locala.writeFields(this);
      }
      AppMethodBeat.o(51920);
    }
  }

  public final void e(int paramInt, String paramString)
  {
    AppMethodBeat.i(51918);
    this.BTX.e(paramInt, paramString);
    AppMethodBeat.o(51918);
  }

  public final void f(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(51913);
    this.BTX.f(paramInt, paramDouble);
    AppMethodBeat.o(51913);
  }

  public final void f(int paramInt1, int paramInt2, LinkedList<?> paramLinkedList)
  {
    AppMethodBeat.i(51921);
    if (paramLinkedList != null)
      switch (paramInt2)
      {
      default:
        paramLinkedList = new IllegalArgumentException("The data type was not found, the id used was ".concat(String.valueOf(paramInt2)));
        AppMethodBeat.o(51921);
        throw paramLinkedList;
      case 2:
        if (paramLinkedList.size() > 0)
        {
          this.BTX.bu(paramInt1, 2);
          this.BTX.fw(e.a.a.a.d(paramInt2, paramLinkedList));
          paramInt1 = 0;
          if (paramInt1 >= paramLinkedList.size())
            AppMethodBeat.o(51921);
        }
        break;
      case 3:
      }
    while (true)
    {
      return;
      this.BTX.fw(((Integer)paramLinkedList.get(paramInt1)).intValue());
      paramInt1++;
      break;
      if (paramLinkedList.size() > 0)
      {
        this.BTX.bu(paramInt1, 2);
        this.BTX.fw(e.a.a.a.d(paramInt2, paramLinkedList));
        for (paramInt1 = 0; ; paramInt1++)
        {
          if (paramInt1 >= paramLinkedList.size())
          {
            AppMethodBeat.o(51921);
            break;
          }
          this.BTX.av(((Long)paramLinkedList.get(paramInt1)).longValue());
        }
      }
      AppMethodBeat.o(51921);
    }
  }

  public final void iA(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138407);
    iz(paramInt1, paramInt2);
    AppMethodBeat.o(138407);
  }

  public final void iy(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51919);
    this.BTX.iy(paramInt1, paramInt2);
    AppMethodBeat.o(51919);
  }

  public final void iz(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51915);
    this.BTX.bq(paramInt1, paramInt2);
    AppMethodBeat.o(51915);
  }

  public final void r(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(51914);
    this.BTX.r(paramInt, paramFloat);
    AppMethodBeat.o(51914);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     e.a.a.c.a
 * JD-Core Version:    0.6.2
 */