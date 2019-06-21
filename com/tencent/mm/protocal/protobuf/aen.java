package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class aen extends bsr
{
  public String app_id;
  public String kbU;
  public b keu;
  public int kmq;
  public String kmr;
  public String kms;
  public String kmt;
  public String kmu;
  public int time_stamp;
  public int wmp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89067);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.app_id != null)
        paramArrayOfObject.e(2, this.app_id);
      paramArrayOfObject.iz(3, this.kmq);
      if (this.kmr != null)
        paramArrayOfObject.e(4, this.kmr);
      if (this.kms != null)
        paramArrayOfObject.e(5, this.kms);
      paramArrayOfObject.iz(6, this.time_stamp);
      if (this.kmt != null)
        paramArrayOfObject.e(7, this.kmt);
      if (this.kbU != null)
        paramArrayOfObject.e(8, this.kbU);
      if (this.kmu != null)
        paramArrayOfObject.e(9, this.kmu);
      if (this.keu != null)
        paramArrayOfObject.c(10, this.keu);
      paramArrayOfObject.iz(11, this.wmp);
      AppMethodBeat.o(89067);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label918;
    label918: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.app_id != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.app_id);
      i += e.a.a.b.b.a.bs(3, this.kmq);
      paramInt = i;
      if (this.kmr != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kmr);
      i = paramInt;
      if (this.kms != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.kms);
      paramInt = i + e.a.a.b.b.a.bs(6, this.time_stamp);
      i = paramInt;
      if (this.kmt != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.kmt);
      paramInt = i;
      if (this.kbU != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.kbU);
      i = paramInt;
      if (this.kmu != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.kmu);
      paramInt = i;
      if (this.keu != null)
        paramInt = i + e.a.a.b.b.a.b(10, this.keu);
      paramInt += e.a.a.b.b.a.bs(11, this.wmp);
      AppMethodBeat.o(89067);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89067);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aen localaen = (aen)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89067);
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
            localaen.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        case 2:
          localaen.app_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        case 3:
          localaen.kmq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        case 4:
          localaen.kmr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        case 5:
          localaen.kms = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        case 6:
          localaen.time_stamp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        case 7:
          localaen.kmt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        case 8:
          localaen.kbU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        case 9:
          localaen.kmu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        case 10:
          localaen.keu = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        case 11:
          localaen.wmp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89067);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89067);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aen
 * JD-Core Version:    0.6.2
 */