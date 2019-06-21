package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class pk extends bsr
{
  public int nUf;
  public String vFb;
  public String vFc;
  public String vWF;
  public String vWG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56758);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vFb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: f2f_id");
        AppMethodBeat.o(56758);
        throw paramArrayOfObject;
      }
      if (this.vFc == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: trans_id");
        AppMethodBeat.o(56758);
        throw paramArrayOfObject;
      }
      if (this.vWG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: receiver_open_id");
        AppMethodBeat.o(56758);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vFb != null)
        paramArrayOfObject.e(2, this.vFb);
      if (this.vFc != null)
        paramArrayOfObject.e(3, this.vFc);
      if (this.vWF != null)
        paramArrayOfObject.e(4, this.vWF);
      if (this.vWG != null)
        paramArrayOfObject.e(5, this.vWG);
      paramArrayOfObject.iz(6, this.nUf);
      AppMethodBeat.o(56758);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label771;
    label771: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vFb != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vFb);
      i = paramInt;
      if (this.vFc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vFc);
      paramInt = i;
      if (this.vWF != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vWF);
      i = paramInt;
      if (this.vWG != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vWG);
      paramInt = i + e.a.a.b.b.a.bs(6, this.nUf);
      AppMethodBeat.o(56758);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vFb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: f2f_id");
          AppMethodBeat.o(56758);
          throw paramArrayOfObject;
        }
        if (this.vFc == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: trans_id");
          AppMethodBeat.o(56758);
          throw paramArrayOfObject;
        }
        if (this.vWG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: receiver_open_id");
          AppMethodBeat.o(56758);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56758);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        pk localpk = (pk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56758);
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
            localpk.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56758);
          paramInt = i;
          break;
        case 2:
          localpk.vFb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56758);
          paramInt = i;
          break;
        case 3:
          localpk.vFc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56758);
          paramInt = i;
          break;
        case 4:
          localpk.vWF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56758);
          paramInt = i;
          break;
        case 5:
          localpk.vWG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56758);
          paramInt = i;
          break;
        case 6:
          localpk.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56758);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56758);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pk
 * JD-Core Version:    0.6.2
 */