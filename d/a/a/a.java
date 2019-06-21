package d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class a extends com.tencent.mm.bt.a
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
    AppMethodBeat.i(57005);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BTs != null)
        paramArrayOfObject.e(1, this.BTs);
      if (this.BTt != null)
        paramArrayOfObject.e(2, this.BTt);
      paramArrayOfObject.iz(3, this.BTu);
      if (this.url != null)
        paramArrayOfObject.e(4, this.url);
      if (this.BTv != null)
      {
        paramArrayOfObject.iy(5, this.BTv.computeSize());
        this.BTv.writeFields(paramArrayOfObject);
      }
      if (this.wqf != null)
        paramArrayOfObject.e(6, this.wqf);
      AppMethodBeat.o(57005);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BTs == null)
        break label627;
    label627: for (paramInt = e.a.a.b.b.a.f(1, this.BTs) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.BTt != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.BTt);
      i += e.a.a.b.b.a.bs(3, this.BTu);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.url);
      i = paramInt;
      if (this.BTv != null)
        i = paramInt + e.a.a.a.ix(5, this.BTv.computeSize());
      paramInt = i;
      if (this.wqf != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wqf);
      AppMethodBeat.o(57005);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(57005);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        a locala = (a)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(57005);
          break;
        case 1:
          locala.BTs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57005);
          paramInt = i;
          break;
        case 2:
          locala.BTt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57005);
          paramInt = i;
          break;
        case 3:
          locala.BTu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(57005);
          paramInt = i;
          break;
        case 4:
          locala.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57005);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new f();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((f)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locala.BTv = ((f)localObject1);
          }
          AppMethodBeat.o(57005);
          paramInt = i;
          break;
        case 6:
          locala.wqf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57005);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(57005);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     d.a.a.a
 * JD-Core Version:    0.6.2
 */