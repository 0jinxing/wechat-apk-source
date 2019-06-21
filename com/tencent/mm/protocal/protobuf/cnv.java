package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cnv extends com.tencent.mm.bt.a
{
  public int type;
  public auj vQK;
  public ms vQN;
  public bln wKU;
  public ba wVH;
  public bto wYU;
  public cgv wbo;
  public cfy xlc;
  public bzy xld;
  public bdn xle;
  public bdw xlf;
  public ob xlg;
  public ui xlh;
  public hg xli;
  public ayp xlj;
  public asd xlk;
  public bht xll;
  public avd xlm;
  public ave xln;
  public cgd xlo;
  public tz xlp;
  public mt xlq;
  public cnx xlr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48986);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.wbo != null)
      {
        paramArrayOfObject.iy(2, this.wbo.computeSize());
        this.wbo.writeFields(paramArrayOfObject);
      }
      if (this.wYU != null)
      {
        paramArrayOfObject.iy(3, this.wYU.computeSize());
        this.wYU.writeFields(paramArrayOfObject);
      }
      if (this.xlc != null)
      {
        paramArrayOfObject.iy(4, this.xlc.computeSize());
        this.xlc.writeFields(paramArrayOfObject);
      }
      if (this.xld != null)
      {
        paramArrayOfObject.iy(5, this.xld.computeSize());
        this.xld.writeFields(paramArrayOfObject);
      }
      if (this.xle != null)
      {
        paramArrayOfObject.iy(6, this.xle.computeSize());
        this.xle.writeFields(paramArrayOfObject);
      }
      if (this.xlf != null)
      {
        paramArrayOfObject.iy(7, this.xlf.computeSize());
        this.xlf.writeFields(paramArrayOfObject);
      }
      if (this.xlg != null)
      {
        paramArrayOfObject.iy(8, this.xlg.computeSize());
        this.xlg.writeFields(paramArrayOfObject);
      }
      if (this.xlh != null)
      {
        paramArrayOfObject.iy(9, this.xlh.computeSize());
        this.xlh.writeFields(paramArrayOfObject);
      }
      if (this.xli != null)
      {
        paramArrayOfObject.iy(10, this.xli.computeSize());
        this.xli.writeFields(paramArrayOfObject);
      }
      if (this.vQN != null)
      {
        paramArrayOfObject.iy(11, this.vQN.computeSize());
        this.vQN.writeFields(paramArrayOfObject);
      }
      if (this.vQK != null)
      {
        paramArrayOfObject.iy(12, this.vQK.computeSize());
        this.vQK.writeFields(paramArrayOfObject);
      }
      if (this.xlj != null)
      {
        paramArrayOfObject.iy(13, this.xlj.computeSize());
        this.xlj.writeFields(paramArrayOfObject);
      }
      if (this.xlk != null)
      {
        paramArrayOfObject.iy(14, this.xlk.computeSize());
        this.xlk.writeFields(paramArrayOfObject);
      }
      if (this.wKU != null)
      {
        paramArrayOfObject.iy(15, this.wKU.computeSize());
        this.wKU.writeFields(paramArrayOfObject);
      }
      if (this.xll != null)
      {
        paramArrayOfObject.iy(16, this.xll.computeSize());
        this.xll.writeFields(paramArrayOfObject);
      }
      if (this.xlm != null)
      {
        paramArrayOfObject.iy(17, this.xlm.computeSize());
        this.xlm.writeFields(paramArrayOfObject);
      }
      if (this.xln != null)
      {
        paramArrayOfObject.iy(18, this.xln.computeSize());
        this.xln.writeFields(paramArrayOfObject);
      }
      if (this.xlo != null)
      {
        paramArrayOfObject.iy(19, this.xlo.computeSize());
        this.xlo.writeFields(paramArrayOfObject);
      }
      if (this.xlp != null)
      {
        paramArrayOfObject.iy(20, this.xlp.computeSize());
        this.xlp.writeFields(paramArrayOfObject);
      }
      if (this.xlq != null)
      {
        paramArrayOfObject.iy(21, this.xlq.computeSize());
        this.xlq.writeFields(paramArrayOfObject);
      }
      if (this.wVH != null)
      {
        paramArrayOfObject.iy(22, this.wVH.computeSize());
        this.wVH.writeFields(paramArrayOfObject);
      }
      if (this.xlr != null)
      {
        paramArrayOfObject.iy(23, this.xlr.computeSize());
        this.xlr.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48986);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.type) + 0;
        i = paramInt;
        if (this.wbo != null)
          i = paramInt + e.a.a.a.ix(2, this.wbo.computeSize());
        paramInt = i;
        if (this.wYU != null)
          paramInt = i + e.a.a.a.ix(3, this.wYU.computeSize());
        i = paramInt;
        if (this.xlc != null)
          i = paramInt + e.a.a.a.ix(4, this.xlc.computeSize());
        paramInt = i;
        if (this.xld != null)
          paramInt = i + e.a.a.a.ix(5, this.xld.computeSize());
        int j = paramInt;
        if (this.xle != null)
          j = paramInt + e.a.a.a.ix(6, this.xle.computeSize());
        i = j;
        if (this.xlf != null)
          i = j + e.a.a.a.ix(7, this.xlf.computeSize());
        paramInt = i;
        if (this.xlg != null)
          paramInt = i + e.a.a.a.ix(8, this.xlg.computeSize());
        j = paramInt;
        if (this.xlh != null)
          j = paramInt + e.a.a.a.ix(9, this.xlh.computeSize());
        i = j;
        if (this.xli != null)
          i = j + e.a.a.a.ix(10, this.xli.computeSize());
        paramInt = i;
        if (this.vQN != null)
          paramInt = i + e.a.a.a.ix(11, this.vQN.computeSize());
        i = paramInt;
        if (this.vQK != null)
          i = paramInt + e.a.a.a.ix(12, this.vQK.computeSize());
        j = i;
        if (this.xlj != null)
          j = i + e.a.a.a.ix(13, this.xlj.computeSize());
        paramInt = j;
        if (this.xlk != null)
          paramInt = j + e.a.a.a.ix(14, this.xlk.computeSize());
        i = paramInt;
        if (this.wKU != null)
          i = paramInt + e.a.a.a.ix(15, this.wKU.computeSize());
        paramInt = i;
        if (this.xll != null)
          paramInt = i + e.a.a.a.ix(16, this.xll.computeSize());
        i = paramInt;
        if (this.xlm != null)
          i = paramInt + e.a.a.a.ix(17, this.xlm.computeSize());
        paramInt = i;
        if (this.xln != null)
          paramInt = i + e.a.a.a.ix(18, this.xln.computeSize());
        i = paramInt;
        if (this.xlo != null)
          i = paramInt + e.a.a.a.ix(19, this.xlo.computeSize());
        paramInt = i;
        if (this.xlp != null)
          paramInt = i + e.a.a.a.ix(20, this.xlp.computeSize());
        i = paramInt;
        if (this.xlq != null)
          i = paramInt + e.a.a.a.ix(21, this.xlq.computeSize());
        paramInt = i;
        if (this.wVH != null)
          paramInt = i + e.a.a.a.ix(22, this.wVH.computeSize());
        i = paramInt;
        if (this.xlr != null)
          i = paramInt + e.a.a.a.ix(23, this.xlr.computeSize());
        AppMethodBeat.o(48986);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48986);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnv localcnv = (cnv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48986);
          break;
        case 1:
          localcnv.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.wbo = ((cgv)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bto();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.wYU = paramArrayOfObject;
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cfy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cfy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlc = ((cfy)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xld = paramArrayOfObject;
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bdn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bdn)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xle = ((bdn)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bdw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bdw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlf = ((bdw)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ob();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ob)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlg = ((ob)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ui();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ui)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlh = ((ui)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xli = ((hg)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ms();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.vQN = paramArrayOfObject;
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new auj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((auj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.vQK = ((auj)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 13:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ayp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ayp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlj = ((ayp)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 14:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new asd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((asd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlk = ((asd)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bln();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.wKU = paramArrayOfObject;
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 16:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bht();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bht)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xll = ((bht)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 17:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new avd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((avd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlm = ((avd)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 18:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ave();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xln = paramArrayOfObject;
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 19:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlo = ((cgd)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 20:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new tz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((tz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlp = ((tz)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 21:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlq = ((mt)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 22:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ba();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.wVH = paramArrayOfObject;
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        case 23:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cnx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cnx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnv.xlr = ((cnx)localObject1);
          }
          AppMethodBeat.o(48986);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48986);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnv
 * JD-Core Version:    0.6.2
 */