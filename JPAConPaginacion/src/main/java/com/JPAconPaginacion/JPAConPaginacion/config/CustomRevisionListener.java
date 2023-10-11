package com.JApiRestIntro.JApiRestIntro.config;

import com.JApiRestIntro.JApiRestIntro.Entidades.audit.Revision;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionListener;

import java.io.Serializable;

public class CustomRevisionListener implements RevisionListener { //Crea una revision cada vez que hago una consulta
    public void newRevision(Object revisionEntity){final Revision revision=(Revision) revisionEntity;
    }
}
