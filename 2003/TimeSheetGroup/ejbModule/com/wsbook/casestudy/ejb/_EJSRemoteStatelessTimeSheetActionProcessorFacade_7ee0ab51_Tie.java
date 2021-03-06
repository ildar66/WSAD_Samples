// Tie class generated by rmic, do not edit.
// Contents subject to change without notice.

package com.wsbook.casestudy.ejb;

import com.wsbook.casestudy.command.UpdateTimesheetFormCommand;
import com.wsbook.casestudy.domain.Employee;
import com.wsbook.casestudy.domain.Project;
import com.wsbook.casestudy.domain.TimeSheet;
import com.wsbook.casestudy.exception.MappingException;
import com.wsbook.casestudy.exception.ModelException;
import com.wsbook.casestudy.exception.NoSuchEmployeeException;
import com.wsbook.casestudy.exception.NoSuchProjectException;
import com.wsbook.casestudy.exception.NoSuchTimeSheetException;
import com.wsbook.casestudy.value.TimeSheets;
import com.wsbook.casestudy.value.WeekEndings;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.ejb.EJBHome;
import javax.ejb.EJBObject;
import javax.ejb.Handle;
import javax.ejb.RemoveException;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.UnknownException;

public class _EJSRemoteStatelessTimeSheetActionProcessorFacade_7ee0ab51_Tie extends org.omg.CORBA_2_3.portable.ObjectImpl implements javax.rmi.CORBA.Tie {
    
    private EJSRemoteStatelessTimeSheetActionProcessorFacade_7ee0ab51 target = null;
    private org.omg.CORBA.ORB orb = null;
    
    private static final String[] _type_ids = {
        "RMI:com.wsbook.casestudy.ejb.TimeSheetActionProcessorFacade:0000000000000000", 
        "RMI:javax.ejb.EJBObject:0000000000000000", 
        "RMI:com.ibm.websphere.csi.CSIServant:0000000000000000", 
        "RMI:com.ibm.websphere.csi.TransactionalObject:0000000000000000"
    };
    
    public void setTarget(java.rmi.Remote target) {
        this.target = (EJSRemoteStatelessTimeSheetActionProcessorFacade_7ee0ab51) target;
    }
    
    public java.rmi.Remote getTarget() {
        return target;
    }
    
    public org.omg.CORBA.Object thisObject() {
        return this;
    }
    
    public void deactivate() {
        if (orb != null) {
            orb.disconnect(this);
            _set_delegate(null);
        }
    }
    
    public org.omg.CORBA.ORB orb() {
        return _orb();
    }
    
    public void orb(org.omg.CORBA.ORB orb) {
        orb.connect(this);
    }
    
    public void _set_delegate(org.omg.CORBA.portable.Delegate del) {
        super._set_delegate(del);
        if (del != null)
            orb = _orb();
        else
            orb = null;
    }
    
    public String[] _ids() { 
        return _type_ids;
    }
    
    public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _in, org.omg.CORBA.portable.ResponseHandler reply) throws org.omg.CORBA.SystemException {
        try {
            org.omg.CORBA_2_3.portable.InputStream in = 
                (org.omg.CORBA_2_3.portable.InputStream) _in;
            switch (method.charAt(4)) {
                case 65: 
                    if (method.equals("findAllProjects")) {
                        return findAllProjects(in, reply);
                    } else if (method.equals("findApprovedForEmployee")) {
                        return findApprovedForEmployee(in, reply);
                    } else if (method.equals("findAllEmployees")) {
                        return findAllEmployees(in, reply);
                    }
                case 69: 
                    if (method.equals("findEmployeeByKey")) {
                        return findEmployeeByKey(in, reply);
                    }
                case 79: 
                    if (method.equals("findOrCreateTimeSheetByKey")) {
                        return findOrCreateTimeSheetByKey(in, reply);
                    }
                case 80: 
                    if (method.equals("findProjectByName")) {
                        return findProjectByName(in, reply);
                    } else if (method.equals("findProjectByKey")) {
                        return findProjectByKey(in, reply);
                    } else if (method.equals("findPendingForEmployee")) {
                        return findPendingForEmployee(in, reply);
                    }
                case 84: 
                    if (method.equals("findTimeSheetByKey")) {
                        return findTimeSheetByKey(in, reply);
                    }
                case 95: 
                    if (method.equals("_get_primaryKey")) {
                        return _get_primaryKey(in, reply);
                    } else if (method.equals("_get_handle")) {
                        return _get_handle(in, reply);
                    } else if (method.equals("_get_EJBHome")) {
                        return _get_EJBHome(in, reply);
                    }
                case 101: 
                    if (method.equals("isIdentical")) {
                        return isIdentical(in, reply);
                    } else if (method.equals("getPendingTimeSheets")) {
                        return getPendingTimeSheets(in, reply);
                    } else if (method.equals("getWeekEndings")) {
                        return getWeekEndings(in, reply);
                    }
                case 109: 
                    if (method.equals("addEmployee")) {
                        return addEmployee(in, reply);
                    }
                case 111: 
                    if (method.equals("approveTimeSheetByKey")) {
                        return approveTimeSheetByKey(in, reply);
                    }
                case 112: 
                    if (method.equals("getApprovedTimeSheets")) {
                        return getApprovedTimeSheets(in, reply);
                    }
                case 114: 
                    if (method.equals("addProject")) {
                        return addProject(in, reply);
                    } else if (method.equals("clearInMemoryCaches")) {
                        return clearInMemoryCaches(in, reply);
                    }
                case 116: 
                    if (method.equals("createTimeSheet")) {
                        return createTimeSheet(in, reply);
                    } else if (method.equals("updateTimesheet")) {
                        return updateTimesheet(in, reply);
                    }
                case 118: 
                    if (method.equals("remove")) {
                        return remove(in, reply);
                    } else if (method.equals("removeProject")) {
                        return removeProject(in, reply);
                    } else if (method.equals("removeEmployee")) {
                        return removeEmployee(in, reply);
                    }
            }
            throw new BAD_OPERATION();
        } catch (SystemException ex) {
            throw ex;
        } catch (Throwable ex) {
            throw new UnknownException(ex);
        }
    }
    
    private org.omg.CORBA.portable.OutputStream _get_EJBHome(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        EJBHome result = target.getEJBHome();
        org.omg.CORBA.portable.OutputStream out = reply.createReply();
        Util.writeRemoteObject(out,result);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream _get_primaryKey(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        Object result = target.getPrimaryKey();
        org.omg.CORBA.portable.OutputStream out = reply.createReply();
        Util.writeAny(out,result);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream remove(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        try {
            target.remove();
        } catch (RemoveException ex) {
            String id = "IDL:javax/ejb/RemoveEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,RemoveException.class);
            return out;
        }
        org.omg.CORBA.portable.OutputStream out = reply.createReply();
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream _get_handle(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        Handle result = target.getHandle();
        org.omg.CORBA.portable.OutputStream out = reply.createReply();
        Util.writeAbstractObject(out,result);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream isIdentical(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        EJBObject arg0 = (EJBObject) in.read_Object(EJBObject.class);
        boolean result = target.isIdentical(arg0);
        org.omg.CORBA.portable.OutputStream out = reply.createReply();
        out.write_boolean(result);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream addProject(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        Project arg0 = (Project) in.read_value(Project.class);
        try {
            target.addProject(arg0);
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        }
        org.omg.CORBA.portable.OutputStream out = reply.createReply();
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream findProjectByName(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        Project result;
        try {
            result = target.findProjectByName(arg0);
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,Project.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream findProjectByKey(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        Project result;
        try {
            result = target.findProjectByKey(arg0);
        } catch (NoSuchProjectException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/NoSuchProjectEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,NoSuchProjectException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,Project.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream findAllProjects(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        ArrayList result;
        try {
            result = target.findAllProjects();
        } catch (ModelException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/ModelEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,ModelException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,ArrayList.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream removeProject(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        try {
            target.removeProject(arg0);
        } catch (NoSuchProjectException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/NoSuchProjectEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,NoSuchProjectException.class);
            return out;
        }
        org.omg.CORBA.portable.OutputStream out = reply.createReply();
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream findOrCreateTimeSheetByKey(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        String arg1 = (String) in.read_value(String.class);
        TimeSheet result;
        try {
            result = target.findOrCreateTimeSheetByKey(arg0, arg1);
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        } catch (ModelException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/ModelEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,ModelException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,TimeSheet.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream createTimeSheet(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        String arg1 = (String) in.read_value(String.class);
        TimeSheet result;
        try {
            result = target.createTimeSheet(arg0, arg1);
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        } catch (ModelException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/ModelEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,ModelException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,TimeSheet.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream findPendingForEmployee(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        ArrayList result;
        try {
            result = target.findPendingForEmployee(arg0);
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,ArrayList.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream findApprovedForEmployee(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        ArrayList result;
        try {
            result = target.findApprovedForEmployee(arg0);
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,ArrayList.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream getPendingTimeSheets(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        TimeSheets result;
        try {
            result = target.getPendingTimeSheets();
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,TimeSheets.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream getApprovedTimeSheets(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        TimeSheets result;
        try {
            result = target.getApprovedTimeSheets();
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,TimeSheets.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream getWeekEndings(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        WeekEndings result;
        try {
            result = target.getWeekEndings(arg0);
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,WeekEndings.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream approveTimeSheetByKey(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        String arg1 = (String) in.read_value(String.class);
        String arg2 = (String) in.read_value(String.class);
        TimeSheet result;
        try {
            result = target.approveTimeSheetByKey(arg0, arg1, arg2);
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        } catch (ModelException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/ModelEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,ModelException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,TimeSheet.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream updateTimesheet(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        UpdateTimesheetFormCommand arg0 = (UpdateTimesheetFormCommand) in.read_value(UpdateTimesheetFormCommand.class);
        TimeSheet result;
        try {
            result = target.updateTimesheet(arg0);
        } catch (ModelException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/ModelEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,ModelException.class);
            return out;
        } catch (NoSuchTimeSheetException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/NoSuchTimeSheetEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,NoSuchTimeSheetException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,TimeSheet.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream findEmployeeByKey(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        Employee result;
        try {
            result = target.findEmployeeByKey(arg0);
        } catch (NoSuchEmployeeException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/NoSuchEmployeeEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,NoSuchEmployeeException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,Employee.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream findAllEmployees(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        ArrayList result;
        try {
            result = target.findAllEmployees();
        } catch (ModelException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/ModelEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,ModelException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,ArrayList.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream removeEmployee(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        try {
            target.removeEmployee(arg0);
        } catch (NoSuchEmployeeException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/NoSuchEmployeeEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,NoSuchEmployeeException.class);
            return out;
        }
        org.omg.CORBA.portable.OutputStream out = reply.createReply();
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream addEmployee(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        Employee arg0 = (Employee) in.read_value(Employee.class);
        try {
            target.addEmployee(arg0);
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        }
        org.omg.CORBA.portable.OutputStream out = reply.createReply();
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream findTimeSheetByKey(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        String arg0 = (String) in.read_value(String.class);
        String arg1 = (String) in.read_value(String.class);
        TimeSheet result;
        try {
            result = target.findTimeSheetByKey(arg0, arg1);
        } catch (MappingException ex) {
            String id = "IDL:com/wsbook/casestudy/_exception/MappingEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,MappingException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value(result,TimeSheet.class);
        return out;
    }
    
    private org.omg.CORBA.portable.OutputStream clearInMemoryCaches(org.omg.CORBA_2_3.portable.InputStream in , org.omg.CORBA.portable.ResponseHandler reply) throws Throwable {
        target.clearInMemoryCaches();
        org.omg.CORBA.portable.OutputStream out = reply.createReply();
        return out;
    }
}
