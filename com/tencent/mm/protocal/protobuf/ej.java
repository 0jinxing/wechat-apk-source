package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ej extends bsr
{
  public String fgd;
  public int nettype;
  public int scene;
  public String session_id;
  public String url;
  public int vFP;
  public int vFQ;
  public int vGf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14693);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.fgd != null)
        paramArrayOfObject.e(3, this.fgd);
      paramArrayOfObject.iz(4, this.scene);
      paramArrayOfObject.iz(5, this.vFQ);
      paramArrayOfObject.iz(6, this.nettype);
      if (this.session_id != null)
        paramArrayOfObject.e(7, this.session_id);
      paramArrayOfObject.iz(8, this.vFP);
      paramArrayOfObject.iz(9, this.vGf);
      AppMethodBeat.o(14693);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label767;
    label767: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.url);
      i = paramInt;
      if (this.fgd != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.fgd);
      i = i + e.a.a.b.b.a.bs(4, this.scene) + e.a.a.b.b.a.bs(5, this.vFQ) + e.a.a.b.b.a.bs(6, this.nettype);
      paramInt = i;
      if (this.session_id != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.session_id);
      paramInt = paramInt + e.a.a.b.b.a.bs(8, this.vFP) + e.a.a.b.b.a.bs(9, this.vGf);
      AppMethodBeat.o(14693);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14693);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ej localej = (ej)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14693);
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
            localej.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(14693);
          paramInt = i;
          break;
        case 2:
          localej.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14693);
          paramInt = i;
          break;
        case 3:
          localej.fgd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14693);
          paramInt = i;
          break;
        case 4:
          localej.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14693);
          paramInt = i;
          break;
        case 5:
          localej.vFQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14693);
          paramInt = i;
          break;
        case 6:
          localej.nettype = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14693);
          paramInt = i;
          break;
        case 7:
          localej.session_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14693);
          paramInt = i;
          break;
        case 8:
          localej.vFP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14693);
          paramInt = i;
          break;
        case 9:
          localej.vGf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14693);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14693);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ej
 * JD-Core Version:    0.6.2
 */