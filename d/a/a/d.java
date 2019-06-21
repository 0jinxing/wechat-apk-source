package d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class d extends com.tencent.mm.bt.a
{
  public String BTs;
  public String BTt;
  public int BTu;
  public f BTv;
  public String url;
  public String wqf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(57009);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BTs != null)
        paramArrayOfObject.e(1, this.BTs);
      if (this.BTt != null)
        paramArrayOfObject.e(2, this.BTt);
      paramArrayOfObject.iz(3, this.BTu);
      if (this.wqf != null)
        paramArrayOfObject.e(4, this.wqf);
      if (this.url != null)
        paramArrayOfObject.e(5, this.url);
      if (this.BTv != null)
      {
        paramArrayOfObject.iy(6, this.BTv.computeSize());
        this.BTv.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(57009);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BTs == null)
        break label626;
    label626: for (paramInt = e.a.a.b.b.a.f(1, this.BTs) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.BTt != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.BTt);
      i += e.a.a.b.b.a.bs(3, this.BTu);
      paramInt = i;
      if (this.wqf != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wqf);
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.url);
      paramInt = i;
      if (this.BTv != null)
        paramInt = i + e.a.a.a.ix(6, this.BTv.computeSize());
      AppMethodBeat.o(57009);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(57009);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        d locald = (d)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(57009);
          break;
        case 1:
          locald.BTs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57009);
          paramInt = i;
          break;
        case 2:
          locald.BTt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57009);
          paramInt = i;
          break;
        case 3:
          locald.BTu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(57009);
          paramInt = i;
          break;
        case 4:
          locald.wqf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57009);
          paramInt = i;
          break;
        case 5:
          locald.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57009);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new f();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locald.BTv = paramArrayOfObject;
          }
          AppMethodBeat.o(57009);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(57009);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     d.a.a.d
 * JD-Core Version:    0.6.2
 */