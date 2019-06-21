package d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g extends com.tencent.mm.bt.a
{
  public String BTP;
  public String BTQ;
  public String BTR;
  public String BTS;
  public String BTT;
  public String pia;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(57012);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pia != null)
        paramArrayOfObject.e(1, this.pia);
      if (this.BTP != null)
        paramArrayOfObject.e(2, this.BTP);
      if (this.BTQ != null)
        paramArrayOfObject.e(3, this.BTQ);
      if (this.BTR != null)
        paramArrayOfObject.e(4, this.BTR);
      if (this.BTS != null)
        paramArrayOfObject.e(5, this.BTS);
      if (this.BTT != null)
        paramArrayOfObject.e(6, this.BTT);
      AppMethodBeat.o(57012);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pia == null)
        break label550;
    label550: for (i = e.a.a.b.b.a.f(1, this.pia) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.BTP != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.BTP);
      i = paramInt;
      if (this.BTQ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.BTQ);
      int j = i;
      if (this.BTR != null)
        j = i + e.a.a.b.b.a.f(4, this.BTR);
      paramInt = j;
      if (this.BTS != null)
        paramInt = j + e.a.a.b.b.a.f(5, this.BTS);
      i = paramInt;
      if (this.BTT != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.BTT);
      AppMethodBeat.o(57012);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(57012);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        g localg = (g)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(57012);
          break;
        case 1:
          localg.pia = locala.BTU.readString();
          AppMethodBeat.o(57012);
          paramInt = i;
          break;
        case 2:
          localg.BTP = locala.BTU.readString();
          AppMethodBeat.o(57012);
          paramInt = i;
          break;
        case 3:
          localg.BTQ = locala.BTU.readString();
          AppMethodBeat.o(57012);
          paramInt = i;
          break;
        case 4:
          localg.BTR = locala.BTU.readString();
          AppMethodBeat.o(57012);
          paramInt = i;
          break;
        case 5:
          localg.BTS = locala.BTU.readString();
          AppMethodBeat.o(57012);
          paramInt = i;
          break;
        case 6:
          localg.BTT = locala.BTU.readString();
          AppMethodBeat.o(57012);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(57012);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     d.a.a.g
 * JD-Core Version:    0.6.2
 */