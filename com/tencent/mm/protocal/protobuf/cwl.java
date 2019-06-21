package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cwl extends bsr
{
  public String csB;
  public LinkedList<String> xse;
  public boolean xsf;
  public String xsg;

  public cwl()
  {
    AppMethodBeat.i(114997);
    this.xse = new LinkedList();
    AppMethodBeat.o(114997);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114998);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      paramArrayOfObject.e(3, 1, this.xse);
      paramArrayOfObject.aO(4, this.xsf);
      if (this.xsg != null)
        paramArrayOfObject.e(5, this.xsg);
      AppMethodBeat.o(114998);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label556;
    label556: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.csB);
      i = i + e.a.a.a.c(3, 1, this.xse) + (e.a.a.b.b.a.fv(4) + 1);
      paramInt = i;
      if (this.xsg != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.xsg);
      AppMethodBeat.o(114998);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xse.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(114998);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cwl localcwl = (cwl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114998);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcwl.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(114998);
          paramInt = i;
          break;
        case 2:
          localcwl.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114998);
          paramInt = i;
          break;
        case 3:
          localcwl.xse.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(114998);
          paramInt = i;
          break;
        case 4:
          localcwl.xsf = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(114998);
          paramInt = i;
          break;
        case 5:
          localcwl.xsg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114998);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114998);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwl
 * JD-Core Version:    0.6.2
 */