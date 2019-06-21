package d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class b extends com.tencent.mm.bt.a
{
  public f BTv;
  public String BTw;
  public String BTx;
  public String BTy;
  public String BTz;
  public String url;
  public int xis;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(57006);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BTv != null)
      {
        paramArrayOfObject.iy(1, this.BTv.computeSize());
        this.BTv.writeFields(paramArrayOfObject);
      }
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.BTw != null)
        paramArrayOfObject.e(3, this.BTw);
      if (this.BTx != null)
        paramArrayOfObject.e(4, this.BTx);
      paramArrayOfObject.iz(5, this.xis);
      if (this.BTy != null)
        paramArrayOfObject.e(6, this.BTy);
      if (this.BTz != null)
        paramArrayOfObject.e(7, this.BTz);
      AppMethodBeat.o(57006);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BTv == null)
        break label694;
    label694: for (i = e.a.a.a.ix(1, this.BTv.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.url);
      i = paramInt;
      if (this.BTw != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.BTw);
      paramInt = i;
      if (this.BTx != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.BTx);
      i = paramInt + e.a.a.b.b.a.bs(5, this.xis);
      paramInt = i;
      if (this.BTy != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.BTy);
      i = paramInt;
      if (this.BTz != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.BTz);
      AppMethodBeat.o(57006);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(57006);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(57006);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new f();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((f)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localb.BTv = ((f)localObject1);
          }
          AppMethodBeat.o(57006);
          paramInt = i;
          break;
        case 2:
          localb.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57006);
          paramInt = i;
          break;
        case 3:
          localb.BTw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57006);
          paramInt = i;
          break;
        case 4:
          localb.BTx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57006);
          paramInt = i;
          break;
        case 5:
          localb.xis = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(57006);
          paramInt = i;
          break;
        case 6:
          localb.BTy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57006);
          paramInt = i;
          break;
        case 7:
          localb.BTz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57006);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(57006);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     d.a.a.b
 * JD-Core Version:    0.6.2
 */