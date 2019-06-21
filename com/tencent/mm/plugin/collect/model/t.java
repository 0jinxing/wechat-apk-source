package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public class t extends com.tencent.mm.bt.a
{
  public String cAa;
  public String cuZ;
  public String eoz;
  public double kCJ;
  public String kCK;
  public int msgType;
  public int scene;
  public int status;
  public int timestamp;
  public String type;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56607);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: username");
        AppMethodBeat.o(56607);
        throw paramArrayOfObject;
      }
      if (this.cAa == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: transactionId");
        AppMethodBeat.o(56607);
        throw paramArrayOfObject;
      }
      if (this.cuZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: feeType");
        AppMethodBeat.o(56607);
        throw paramArrayOfObject;
      }
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      if (this.cAa != null)
        paramArrayOfObject.e(2, this.cAa);
      paramArrayOfObject.f(3, this.kCJ);
      if (this.cuZ != null)
        paramArrayOfObject.e(4, this.cuZ);
      paramArrayOfObject.iz(5, this.timestamp);
      paramArrayOfObject.iz(6, this.scene);
      paramArrayOfObject.iz(7, this.status);
      if (this.eoz != null)
        paramArrayOfObject.e(8, this.eoz);
      if (this.kCK != null)
        paramArrayOfObject.e(9, this.kCK);
      paramArrayOfObject.iz(10, this.msgType);
      if (this.type != null)
        paramArrayOfObject.e(11, this.type);
      AppMethodBeat.o(56607);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label932;
    label932: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cAa != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cAa);
      i += e.a.a.b.b.a.fv(3) + 8;
      paramInt = i;
      if (this.cuZ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.cuZ);
      i = paramInt + e.a.a.b.b.a.bs(5, this.timestamp) + e.a.a.b.b.a.bs(6, this.scene) + e.a.a.b.b.a.bs(7, this.status);
      paramInt = i;
      if (this.eoz != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.eoz);
      i = paramInt;
      if (this.kCK != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.kCK);
      i += e.a.a.b.b.a.bs(10, this.msgType);
      paramInt = i;
      if (this.type != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.type);
      AppMethodBeat.o(56607);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.username == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: username");
          AppMethodBeat.o(56607);
          throw paramArrayOfObject;
        }
        if (this.cAa == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: transactionId");
          AppMethodBeat.o(56607);
          throw paramArrayOfObject;
        }
        if (this.cuZ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: feeType");
          AppMethodBeat.o(56607);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56607);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        t localt = (t)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56607);
          break;
        case 1:
          localt.username = locala.BTU.readString();
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        case 2:
          localt.cAa = locala.BTU.readString();
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        case 3:
          localt.kCJ = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        case 4:
          localt.cuZ = locala.BTU.readString();
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        case 5:
          localt.timestamp = locala.BTU.vd();
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        case 6:
          localt.scene = locala.BTU.vd();
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        case 7:
          localt.status = locala.BTU.vd();
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        case 8:
          localt.eoz = locala.BTU.readString();
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        case 9:
          localt.kCK = locala.BTU.readString();
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        case 10:
          localt.msgType = locala.BTU.vd();
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        case 11:
          localt.type = locala.BTU.readString();
          AppMethodBeat.o(56607);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56607);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.t
 * JD-Core Version:    0.6.2
 */