package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class po extends bsr
{
  public int cIb;
  public int nUf;
  public String pPT;
  public String vWG;
  public String vWJ;
  public String vWK;
  public int vWL;
  public String vWM;
  public String vWN;
  public String vWO;
  public String vWP;
  public int vWQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48799);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vWJ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: receiver_name");
        AppMethodBeat.o(48799);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vWJ != null)
        paramArrayOfObject.e(2, this.vWJ);
      paramArrayOfObject.iz(3, this.nUf);
      if (this.vWK != null)
        paramArrayOfObject.e(4, this.vWK);
      if (this.pPT != null)
        paramArrayOfObject.e(5, this.pPT);
      paramArrayOfObject.iz(6, this.vWL);
      paramArrayOfObject.iz(7, this.cIb);
      if (this.vWM != null)
        paramArrayOfObject.e(8, this.vWM);
      if (this.vWG != null)
        paramArrayOfObject.e(9, this.vWG);
      if (this.vWN != null)
        paramArrayOfObject.e(10, this.vWN);
      if (this.vWO != null)
        paramArrayOfObject.e(11, this.vWO);
      if (this.vWP != null)
        paramArrayOfObject.e(12, this.vWP);
      paramArrayOfObject.iz(13, this.vWQ);
      AppMethodBeat.o(48799);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1080;
    label1080: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vWJ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vWJ);
      i += e.a.a.b.b.a.bs(3, this.nUf);
      paramInt = i;
      if (this.vWK != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vWK);
      i = paramInt;
      if (this.pPT != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.pPT);
      i = i + e.a.a.b.b.a.bs(6, this.vWL) + e.a.a.b.b.a.bs(7, this.cIb);
      paramInt = i;
      if (this.vWM != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vWM);
      i = paramInt;
      if (this.vWG != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vWG);
      paramInt = i;
      if (this.vWN != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vWN);
      i = paramInt;
      if (this.vWO != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.vWO);
      paramInt = i;
      if (this.vWP != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vWP);
      paramInt += e.a.a.b.b.a.bs(13, this.vWQ);
      AppMethodBeat.o(48799);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vWJ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: receiver_name");
          AppMethodBeat.o(48799);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48799);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        po localpo = (po)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48799);
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
            localpo.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 2:
          localpo.vWJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 3:
          localpo.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 4:
          localpo.vWK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 5:
          localpo.pPT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 6:
          localpo.vWL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 7:
          localpo.cIb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 8:
          localpo.vWM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 9:
          localpo.vWG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 10:
          localpo.vWN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 11:
          localpo.vWO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 12:
          localpo.vWP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        case 13:
          localpo.vWQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48799);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48799);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.po
 * JD-Core Version:    0.6.2
 */