package d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class e extends com.tencent.mm.bt.a
{
  public String BTG;
  public String BTH;
  public String BTI;
  public String BTJ;
  public String BTK;
  public int BTL;
  public d BTM;
  public b BTN;
  public b BTO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(57010);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BTG != null)
        paramArrayOfObject.e(1, this.BTG);
      if (this.BTH != null)
        paramArrayOfObject.e(2, this.BTH);
      if (this.BTI != null)
        paramArrayOfObject.e(3, this.BTI);
      if (this.BTJ != null)
        paramArrayOfObject.e(4, this.BTJ);
      if (this.BTK != null)
        paramArrayOfObject.e(5, this.BTK);
      paramArrayOfObject.iz(6, this.BTL);
      if (this.BTM != null)
      {
        paramArrayOfObject.iy(7, this.BTM.computeSize());
        this.BTM.writeFields(paramArrayOfObject);
      }
      if (this.BTN != null)
        paramArrayOfObject.c(8, this.BTN);
      if (this.BTO != null)
        paramArrayOfObject.c(9, this.BTO);
      AppMethodBeat.o(57010);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BTG == null)
        break label820;
    label820: for (i = e.a.a.b.b.a.f(1, this.BTG) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.BTH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.BTH);
      i = paramInt;
      if (this.BTI != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.BTI);
      paramInt = i;
      if (this.BTJ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.BTJ);
      i = paramInt;
      if (this.BTK != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.BTK);
      i += e.a.a.b.b.a.bs(6, this.BTL);
      paramInt = i;
      if (this.BTM != null)
        paramInt = i + e.a.a.a.ix(7, this.BTM.computeSize());
      i = paramInt;
      if (this.BTN != null)
        i = paramInt + e.a.a.b.b.a.b(8, this.BTN);
      paramInt = i;
      if (this.BTO != null)
        paramInt = i + e.a.a.b.b.a.b(9, this.BTO);
      AppMethodBeat.o(57010);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(57010);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        e locale = (e)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(57010);
          break;
        case 1:
          locale.BTG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57010);
          paramInt = i;
          break;
        case 2:
          locale.BTH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57010);
          paramInt = i;
          break;
        case 3:
          locale.BTI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57010);
          paramInt = i;
          break;
        case 4:
          locale.BTJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57010);
          paramInt = i;
          break;
        case 5:
          locale.BTK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57010);
          paramInt = i;
          break;
        case 6:
          locale.BTL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(57010);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((d)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locale.BTM = ((d)localObject1);
          }
          AppMethodBeat.o(57010);
          paramInt = i;
          break;
        case 8:
          locale.BTN = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(57010);
          paramInt = i;
          break;
        case 9:
          locale.BTO = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(57010);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(57010);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     d.a.a.e
 * JD-Core Version:    0.6.2
 */