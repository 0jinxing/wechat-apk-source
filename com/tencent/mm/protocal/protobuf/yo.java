package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class yo extends bsr
{
  public int vFH;
  public String vMR;
  public b wcJ;
  public b wer;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11747);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vMR != null)
        paramArrayOfObject.e(2, this.vMR);
      paramArrayOfObject.iz(3, this.vFH);
      if (this.wer != null)
        paramArrayOfObject.c(4, this.wer);
      if (this.wcJ != null)
        paramArrayOfObject.c(5, this.wcJ);
      AppMethodBeat.o(11747);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label574;
    label574: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vMR != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vMR);
      i += e.a.a.b.b.a.bs(3, this.vFH);
      paramInt = i;
      if (this.wer != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.wer);
      i = paramInt;
      if (this.wcJ != null)
        i = paramInt + e.a.a.b.b.a.b(5, this.wcJ);
      AppMethodBeat.o(11747);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11747);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        yo localyo = (yo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11747);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localyo.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11747);
          paramInt = i;
          break;
        case 2:
          localyo.vMR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11747);
          paramInt = i;
          break;
        case 3:
          localyo.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11747);
          paramInt = i;
          break;
        case 4:
          localyo.wer = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(11747);
          paramInt = i;
          break;
        case 5:
          localyo.wcJ = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(11747);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11747);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yo
 * JD-Core Version:    0.6.2
 */