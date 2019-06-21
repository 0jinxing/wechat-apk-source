package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class qk extends bsr
{
  public String fMd;
  public String ndF;
  public String ndG;
  public int vHo;
  public String vRw;
  public long vXv;
  public String vXw;
  public String vXx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135752);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ndG != null)
        paramArrayOfObject.e(2, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(3, this.ndF);
      paramArrayOfObject.ai(4, this.vXv);
      if (this.vRw != null)
        paramArrayOfObject.e(5, this.vRw);
      if (this.vXw != null)
        paramArrayOfObject.e(6, this.vXw);
      paramArrayOfObject.iz(7, this.vHo);
      if (this.vXx != null)
        paramArrayOfObject.e(8, this.vXx);
      if (this.fMd != null)
        paramArrayOfObject.e(9, this.fMd);
      AppMethodBeat.o(135752);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label807;
    label807: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ndG != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ndG);
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ndF);
      i += e.a.a.b.b.a.o(4, this.vXv);
      paramInt = i;
      if (this.vRw != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vRw);
      i = paramInt;
      if (this.vXw != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vXw);
      i += e.a.a.b.b.a.bs(7, this.vHo);
      paramInt = i;
      if (this.vXx != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vXx);
      i = paramInt;
      if (this.fMd != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.fMd);
      AppMethodBeat.o(135752);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(135752);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        qk localqk = (qk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135752);
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
            localqk.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(135752);
          paramInt = i;
          break;
        case 2:
          localqk.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135752);
          paramInt = i;
          break;
        case 3:
          localqk.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135752);
          paramInt = i;
          break;
        case 4:
          localqk.vXv = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(135752);
          paramInt = i;
          break;
        case 5:
          localqk.vRw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135752);
          paramInt = i;
          break;
        case 6:
          localqk.vXw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135752);
          paramInt = i;
          break;
        case 7:
          localqk.vHo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135752);
          paramInt = i;
          break;
        case 8:
          localqk.vXx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135752);
          paramInt = i;
          break;
        case 9:
          localqk.fMd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135752);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135752);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qk
 * JD-Core Version:    0.6.2
 */