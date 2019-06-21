package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class el extends bsr
{
  public int kdC;
  public int scene;
  public String session_id;
  public String url;
  public int vFO;
  public int vFP;
  public int vFQ;
  public int vGr;
  public String vGs;
  public int vGt;
  public int vGu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14696);
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
      paramArrayOfObject.iz(5, this.vGr);
      if (this.vGs != null)
        paramArrayOfObject.e(6, this.vGs);
      paramArrayOfObject.iz(7, this.vGt);
      paramArrayOfObject.iz(8, this.kdC);
      paramArrayOfObject.iz(9, this.vGu);
      paramArrayOfObject.iz(10, this.scene);
      paramArrayOfObject.iz(11, this.vFQ);
      paramArrayOfObject.iz(12, this.vFP);
      paramArrayOfObject.iz(13, this.vFO);
      if (this.session_id != null)
        paramArrayOfObject.e(14, this.session_id);
      AppMethodBeat.o(14696);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label923;
    label923: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.url);
      i += e.a.a.b.b.a.bs(5, this.vGr);
      paramInt = i;
      if (this.vGs != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vGs);
      i = paramInt + e.a.a.b.b.a.bs(7, this.vGt) + e.a.a.b.b.a.bs(8, this.kdC) + e.a.a.b.b.a.bs(9, this.vGu) + e.a.a.b.b.a.bs(10, this.scene) + e.a.a.b.b.a.bs(11, this.vFQ) + e.a.a.b.b.a.bs(12, this.vFP) + e.a.a.b.b.a.bs(13, this.vFO);
      paramInt = i;
      if (this.session_id != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.session_id);
      AppMethodBeat.o(14696);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14696);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        el localel = (el)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 3:
        case 4:
        default:
          AppMethodBeat.o(14696);
          paramInt = -1;
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
            localel.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 2:
          localel.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 5:
          localel.vGr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 6:
          localel.vGs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 7:
          localel.vGt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 8:
          localel.kdC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 9:
          localel.vGu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 10:
          localel.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 11:
          localel.vFQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 12:
          localel.vFP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 13:
          localel.vFO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        case 14:
          localel.session_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14696);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(14696);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.el
 * JD-Core Version:    0.6.2
 */