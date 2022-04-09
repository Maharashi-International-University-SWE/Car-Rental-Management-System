import React, { useRef } from 'react';
import styled from "styled-components";
import Fleet from "./Fleet";

const Fleets = ({cars}) => {


    return (
        <FleetSection id='fleetSection'>
            <div className="content container">
                <h2 className="text-uppercase text-center" style={{marginTop: '15%', fontSize: '300%'}}>RENT THE LUXURY. OWN THE THRILL.</h2>
                <p style={{fontSize: '150%', marginTop: '3%'}}>From exotic sports cars to luxury sedans and SUVs, the Exotic Car Collection by <span style={{fontWeight: 'bold', fontStyle: 'italic', color: 'red'}}>Luxury Car </span><span style={{fontWeight: 'bold', fontStyle: 'italic'}}>Rentals</span> offers an exceptional selection and the trusted, personalized service of Luxury Car Rentals.</p>
                <div className="fleets">
                    {
                       cars.length > 0 && cars.map((car,index) =>
                            <Fleet key={car.carId} carId={car.carId} reserveStatus={car.isReserved} img={car.imageCover} brand={car.name} model={car.model} description={car.description} />
                        )
                    }
                </div>
            </div>
        </FleetSection>
    );
};

const FleetSection = styled.div`
    padding: 6rem 0;
    .fleets{
      margin-top: 15%;
      display: flex;
      gap: 1rem;
      padding: 10rem 0 5rem;
      flex-wrap: wrap
    }
`;

export default Fleets;
